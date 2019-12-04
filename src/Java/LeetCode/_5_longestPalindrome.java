package Java.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class _5_longestPalindrome {
    public String Length(String s){
        int start[]=new int[1000];
        int end[]=new int[1000];
        int start1[]=new int[1000];
        int end1[]=new int[1000];
        int temp[]=new int[1000];//如果不是回文串存放0
        int ans=0;
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for (int i = 0; i <s.length() ; i++) {
            map.put(s.charAt(i),i);
        }
        System.out.print(map);
        for (int i = 0,j=0,k=0,l=0; i <s.length();i++) {
            if(s.charAt(i)!=start1[l]){//babad//0 b,1 a,//acbbca//accbaabc(NO)//cbba 0
                start[k]=i;
                start1[k]=s.charAt(i);
                if(map.get(s.charAt(i))==i){
                    l++;
                    j++;
                }
                k++;
            }else{
                end[j]=i;
                end1[j]=s.charAt(i);
                l++;
                j++;
            }
        }

        int count=0;
        int sss=0;
        int b=0;
        if(end[b]==0){
            b=1;
        }else{
            b=0;
        }
        for (;end[b]!=0; b++) {
            int left=start[b];
            int right=end[b];
            for(int L=left,R=right;L!=R&&L+1!=R;L++,R--){
                if(s.charAt(L+1)==s.charAt(R-1)){
                    count++;
                }else{
                    break;
                }
            }
            if(count==(right-left)/2){
                temp[b]=right-left+1;
                count=0;
            }else{
                temp[b]=0;
            }
        }
        int max=0;
        int index=0;
        for (int i = 0; i <temp.length ; i++) {
            if(max>temp[i]){
                continue;
            }else{
                max=temp[i];
                index=i;
            }
        }
        int m=start[index];
        int n=end[index];
        String ss="";
        if(n+1==s.length()){
            ss=s.substring(m);
        }else{
            ss=s.substring(m,n+1);
        }
        return ss;
    }
}
//代码有错误，错误在于不能查找三个以上的相同的数据，end的判定有一定问题，暂时这样
/*重新进行分析
* 题目要求找出最长回文子串
* 回文串：顺序和逆序一样，类似aba，abccba，cbbn
* 之前的写法是通过几个数组来存储相同的字符的位置，一个数组按照顺序存储，第二个数组存储有相同的放入然后后移
* 这样会造成很多问题，1.无法识别第一个数据整个不存在的情况，解决办法是使用一个哈希表使用内部的contain方法，这样能够解决这个问题
*                     2.无法判断有三个相同字符的问题
* 重新分析：一个不特殊的字符串：acbcncbb
*                               符合第一个不存在，符合有多个子字符串的判定，存在三个或以上的字符存在
* 动态规划
* start下标和end下标
* 如果有三个及以上的字符，则循环进行，start不变，end移动到下一个，hu*/