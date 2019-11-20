package Java.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int [] nums, int target){
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],i);
        }//将所有数据放入hashmap
        for (int i = 0; i <nums.length ; i++) {
            int complement=target-nums[i];
            if(map.containsKey(complement)&&map.get(complement)!=i){
                int key=map.get(complement);
                return new int[]{i,key};
            }
        }//通过hashmap中的contain方法来检测是否存在这个值，降低时间复杂度
        throw new IllegalArgumentException("no");
    }
}
