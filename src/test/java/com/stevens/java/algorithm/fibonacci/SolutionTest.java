package com.stevens.java.algorithm.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void fibonacci() {
        Solution solution = new Solution();
        int result = solution.fib(1);
        Assert.assertEquals("", 1, result);
    }


    @Test
    public void fibonacci2() {
        Solution solution = new Solution();
        int result = solution.fib(4);
        Assert.assertEquals("", 3, result);
    }
}