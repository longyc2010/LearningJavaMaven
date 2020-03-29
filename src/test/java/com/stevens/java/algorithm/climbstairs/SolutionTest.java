package com.stevens.java.algorithm.climbstairs;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void climbStairs() {
        Solution solution = new Solution();
        int result = solution.climbStairs(3);
        Assert.assertEquals("", 3, result);
    }
}