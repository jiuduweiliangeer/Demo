package Java.LeetCode;

import java.util.*;
/*给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。

注意：答案中不可以包含重复的三元组。

例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，

满足要求的三元组集合为：
[
  [-1, 0, 1],
  [-1, -1, 2]
]*/
public class _15_threesums {
    public List<List<Integer>> threeSums(int []nums){
        Arrays.sort(nums);
        List<List<Integer>> lists=new ArrayList<List<Integer>>();
        /*if(nums.length<=2){
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
        }*/
        if (nums.length<=2){
            return lists;
        }
        int start;
        int end=0;
        for (int i = 0,k=0; i <nums.length ; i++) {
            start=i+1;
            end=nums.length-1;
            if(nums[i]>0){
                break;//排序之后最开始大于零则不可能为0
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;//去重复
            }
            while (start<end){
                int temp=nums[i]+nums[start]+nums[end];
                if (temp<0){
                    start++;
                }else if(temp>0){
                    end--;
                }else{
                    lists.add(new ArrayList<Integer>());
                    lists.get(k).add(nums[i]);
                    lists.get(k).add(nums[start]);
                    lists.get(k).add(nums[end]);
                    while (start<end&&nums[start]==nums[start+1]){
                        start++;//去重复
                    }
                    while (start<end&&nums[end]==nums[end-1]){
                        end--;//去重复
                    }
                    start++;
                    end--;
                    k++;
                }
            }
        }
        return lists;
    }
}
//在固定一个值时，其余两个值任何一个都不能相等，所以使用start和end来加或者减来进行查重
/*当前有瑕疵
* 使用哈希表来判断是否重复时候因为二分法查找方法的索引重复问题导致数据不完整*/
/*-4    -2  -2  -2  0   1   2   2   2   3   3   4   4   6   6
* 0     1   2   3   4   5   6   7   8   9   10  11  12  13  14
* i     L                                                   R
* i         L                                               R
* i             L                                           R
* i             L                                       R
* i                 L                               R
* temp=-4+-2+6=0放入列表中
* nums[L]==nums[L+1] L++    nums[L]==nums[L+1] L++
* nums[R]==nums[R-1] R--
* L++ R--*/