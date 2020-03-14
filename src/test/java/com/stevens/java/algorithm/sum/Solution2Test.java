package com.stevens.java.algorithm.sum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution2Test {
    Solution2 solution2;

    @Before
    public void setUp() throws Exception {
        solution2 = new Solution2();
    }

    @Test
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Assert.assertArrayEquals("array equal", new int[]{0, 1}, solution2.twoSum(nums, target));
    }
}