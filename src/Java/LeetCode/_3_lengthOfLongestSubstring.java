package Java.LeetCode;

import java.util.HashMap;
import java.util.Map;
/*给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。*/
/*Hashmap+游标判定首尾*/
public class _3_lengthOfLongestSubstring {
    public int lengthOfString(String s){
        int answer=0;
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for (int  start= 0,end=0; end <s.length() ; end++) {
            if(map.containsKey(s.charAt(end))){
                start=Math.max(map.get(s.charAt(end)),start);//确定初始位置
            }
            answer=Math.max(end-start+1,answer);//通过两个下标的差来进行判断当前长度，再根据之前记录的长度来进行判定。
            map.put(s.charAt(end),end+1);
        }
        return answer;
    }
}
/*
    编写记录：
        错误1：第一次编写直接调用了clear方法清除了之前的所有数据来进行判定，出现了类似dvdf的判定错误
        错误2：在错误1的基础上加上了中间值来加之前清除的数据，但是没有考虑到后续可能重复的值同样会被清除
        思考1：考虑再写一个哈希表或者通过remove方法删除数据和之前的值，但是会出现双重循环，使用HashMap没有意义，同理用数组存储也没有意义
        思考2：如何在不添加多的表或者数组的情况下记录，考虑到HashMap的K,V唯一性，V可以替换成下标，所以可以考虑设置初始位置和结束位置，通过两者差来判断长度，
        所需要解决的就是移动初始标记，内存占用较少。
        答题区有一位和思路相似，参考进行修改
*/
