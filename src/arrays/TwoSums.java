package arrays;

import java.util.*;

public class TwoSums {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;

        for(int i = 0; i < length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement) , i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        int target = 4;
        int[] sol = twoSum(nums, target);
        System.out.println(Arrays.toString(sol));
    }
}
