package Java.LeetCode;

import java.util.HashMap;
import java.util.Map;

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
