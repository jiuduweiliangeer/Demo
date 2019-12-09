package Java.LeetCode;

import java.util.*;

public class _15_threesums {
    public List<List<Integer>> threeSums(int []nums){
        Arrays.sort(nums);
        List<List<Integer>> lists=new ArrayList<List<Integer>>();
        if(nums.length<=2){
            return lists;
        }
        int k=0;
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for (int start = 0; start <nums.length ; start++) {
            for (int end=0;end<nums.length;end++){
                if(start!=end){
                    int temp=0-(nums[start]+nums[end]);
                    if(Arrays.binarySearch(nums,temp)>=0&&Arrays.binarySearch(nums,temp)!=start&&Arrays.binarySearch(nums,temp)!=end){
                        if((map.containsKey(nums[start])&&map.containsKey(nums[end])||
                                (map.containsKey(nums[start])&&map.containsKey(Arrays.binarySearch(nums,temp)))||
                                (map.containsKey(nums[end])&&map.containsKey(nums[Arrays.binarySearch(nums,temp)])))){
                            continue;
                        }else{
                            map.put(nums[start],start);
                            map.put(nums[end],end);
                            map.put(nums[Arrays.binarySearch(nums,temp)],Arrays.binarySearch(nums,temp));
                            lists.add(new ArrayList<Integer>());
                            lists.get(k).add(nums[start]);
                            lists.get(k).add(nums[end]);
                            lists.get(k).add(nums[Arrays.binarySearch(nums,temp)]);
                            k++;
                        }
                    }else{
                        continue;
                    }
                }else {
                    continue;
                }
            }
        }
        return lists;
    }
}
/*当前有瑕疵
* 使用哈希表来判断是否重复时候因为二分法查找方法的索引重复问题导致数据不完整*/