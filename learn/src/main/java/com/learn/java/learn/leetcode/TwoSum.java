package com.learn.java.learn.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1. Two Sum
 * <p>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 */
public class TwoSum {
    /**
     * 1. Two Sum
     * <p>
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * @param nums   integer array
     * @param target
     * @return array of indices of the two numbers such that they add up to target.
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);

        }
        return new int[]{-1, -1};
    }


    public static int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum2(new int[]{2, 7, 11, 15}, 9)));
    }
}
