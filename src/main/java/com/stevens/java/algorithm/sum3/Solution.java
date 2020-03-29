package com.stevens.java.algorithm.sum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return Collections.emptyList();
        }

        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            // 加速1：c为非负数，就不能满足a+b+c=0了
            if (nums[i] > 0) {
                return results;
            }
            // 加速2：跳过计算过的数据，同时防止结果重复
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int head = i + 1;
            int tail = nums.length - 1;
            int left = 0 - nums[i];
            while (head < tail) {
                if (nums[head] > left) {
                    break;
                }
                int sum = nums[head] + nums[tail];
                if (left == sum) {
                    results.add(Arrays.asList(nums[i], nums[head], nums[tail]));
                    // 加速3：跳过计算过的数据，同时防止结果重复
                    while (head < tail && nums[head] == nums[head + 1]) {
                        head++;
                    }
                    while (head < tail && nums[tail] == nums[tail - 1]) {
                        tail--;
                    }
                }
                if (left > sum) {
                    head++;
                } else {
                    tail--;
                }
            }

        }
        return results;
    }
}
