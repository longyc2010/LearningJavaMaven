package com.stevens.java.algorithm.sum;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int leftNum = target - nums[i];
            if (sumMap.containsKey(leftNum)) {
                return new int[]{
                        sumMap.get(leftNum), i
                };
            }
            sumMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("have no conclusion");
    }
}
