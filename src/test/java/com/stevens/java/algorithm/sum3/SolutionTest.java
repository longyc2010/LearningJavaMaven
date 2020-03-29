package com.stevens.java.algorithm.sum3;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SolutionTest {


    @Test
    public void threeSum() {
        Solution solution = new Solution();
        List<List<Integer>> results = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(results);
    }

    @Test
    public void threeSum2() {
        Solution solution = new Solution();
        List<List<Integer>> results = solution.threeSum(new int[]{1, 2, -2, -1});
        System.out.println(results);
    }


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void threeSum1() {
    }
}