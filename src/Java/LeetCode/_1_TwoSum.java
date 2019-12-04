package Java.LeetCode;

import java.util.HashMap;
import java.util.Map;
/*给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
*/
/*Hashmap的containkey方法时间复杂度（0~n），可降低时间复杂度，而containvalue等于遍历，所以底层方法复杂度和直接写没有区别*/
public class _1_TwoSum {
    public int[] twoSum(int [] nums, int target){
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],i);
        }//将所有数据放入hashmap
        for (int i = 0; i <nums.length ; i++) {
            int complement=target-nums[i];
            if(map.containsKey(complement)&&map.get(complement)!=i){/*如果数组中存在相同元素，则会替换掉value，当当前value等于key的value，
            说明被覆盖了，也就是说数组中有同样的元素，同样的元素不能被重复利用*/
                int key=map.get(complement);
                return new int[]{i,key};
            }
        }//通过hashmap中的contain方法来检测是否存在这个值，降低时间复杂度
        throw new IllegalArgumentException("no");
    }
}//时间复杂度为O(n)
