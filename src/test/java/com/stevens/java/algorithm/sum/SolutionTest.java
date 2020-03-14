package com.stevens.java.algorithm.sum;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Assert.assertArrayEquals("array equal", new int[]{0, 1}, solution.twoSum(nums, target));
    }
}