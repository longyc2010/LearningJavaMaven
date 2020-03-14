package com.stevens.java.algorithm.sum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int firstNum = 0;
        int secondNum = 0;
        for (int i = 0; i < nums.length; i++) {
            firstNum = nums[i];
            if (firstNum > target) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                secondNum = nums[j];
                if (secondNum > target) {
                    continue;
                }
                if (firstNum + secondNum == target) {
                    return new int[]{
                            i, j
                    };
                }
            }

        }
        return new int[]{0, 0};
    }
}
