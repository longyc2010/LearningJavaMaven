package com.stevens.java.algorithm.coursescheduleii;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionIITest {

    @Test
    public void findOrder() {
        SolutionII solution = new SolutionII();
        int[][] input = {{1, 0}};
        int[] ret = solution.findOrder(2, input);

        Assert.assertArrayEquals("findOrder", new int[]{0, 1}, ret);
    }

    @Test
    public void findOrderw() {
        SolutionII solution = new SolutionII();
        int numCourses = 4;
        int[][] input = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] ret = solution.findOrder(numCourses, input);
        System.out.println(Arrays.toString(ret));
        Assert.assertArrayEquals("findOrder", new int[]{0, 1, 2, 3}, ret);
    }

    @Test
    public void findOrder2() {
        SolutionII solution = new SolutionII();
        int numCourses = 4;
        int[][] input = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] ret = solution.findOrder(numCourses, input);
        System.out.println(Arrays.toString(ret));

        Assert.assertArrayEquals("findOrder", new int[]{0, 2, 1, 3}, ret);
    }

    @Test
    public void findOrder3() {
        SolutionII solution = new SolutionII();
        int numCourses = 3;
        int[][] input = {{1, 0}};
        int[] ret = solution.findOrder(numCourses, input);
        System.out.println(Arrays.toString(ret));

        Assert.assertArrayEquals("findOrder", new int[]{2, 0, 1}, ret);
    }
}