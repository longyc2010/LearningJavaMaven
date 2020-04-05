package com.stevens.java.algorithm.coursescheduleii;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void findOrder() {
        Solution solution = new Solution();
        int[][] input = {{1, 0}};
        int[] ret = solution.findOrder(2, input);

        Assert.assertArrayEquals("findOrder", new int[]{0, 1}, ret);
    }
}