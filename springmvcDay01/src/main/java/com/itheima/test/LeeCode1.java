package com.itheima.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeeCode1 {


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};


    }

    public static void main(String[] args) {
        LeeCode1 leeCode1 = new LeeCode1();
        int[] arr = {2, 7, 11};
        int target = 9;
        int[] arr1 = leeCode1.twoSum(arr, target);
        System.out.println(Arrays.toString(arr1));

    }


}
