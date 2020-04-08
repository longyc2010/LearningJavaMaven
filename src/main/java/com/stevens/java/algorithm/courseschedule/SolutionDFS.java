package com.stevens.java.algorithm.courseschedule;

import java.util.ArrayList;
import java.util.List;

public class SolutionDFS {


    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }
        int[] courseFlags = new int[numCourses];

        for (int[] pre : prerequisites) {
            list.get(pre[1]).add(pre[0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(list, courseFlags, i)) {
                return false;
            }
        }


        return true;
    }

    private boolean dfs(List<List<Integer>> list, int[] courseFlags, int i) {
        if (courseFlags[i] == -1) {
            return true;
        }

        if (courseFlags[i] == 1) {
            return false;
        }

        courseFlags[i] = 1;

        for (int course : list.get(i)) {
            if (!dfs(list, courseFlags, course)) {
                return false;
            }
        }

        courseFlags[i] = -1;
        return true;
    }


}
