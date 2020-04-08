package com.stevens.java.algorithm.courseschedule;

import org.junit.Assert;
import org.junit.Test;

public class SolutionDFSTest {


    @Test
    public void canFinish() {
        SolutionDFS solution = new SolutionDFS();
        int course = 2;
        int[][] prerequisites = {{1, 0}};
        boolean result = solution.canFinish(course, prerequisites);
        Assert.assertEquals("can Finish", result, true);
    }


    @Test
    public void canFinish2() {
        SolutionDFS solution = new SolutionDFS();
        int course = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};
        boolean result = solution.canFinish(course, prerequisites);
        Assert.assertEquals("can Finish", result, false);
    }
}