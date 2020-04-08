package com.stevens.java.algorithm.coursescheduleii;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SolutionII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();

        int[] indegrees = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            list.get(pre[1]).add(pre[0]);
            indegrees[pre[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegrees[i] == 0) {
                queue.add(i);
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int pre = queue.poll();
            result.add(pre);
            for (int i : list.get(pre)) {
                indegrees[i]--;
                if (indegrees[i] == 0) {
                    queue.add(i);
                }
            }
        }

        if (result.size() == numCourses) {
            int[] ret = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                ret[i] = result.get(i);
            }
            return ret;
        }

        return new int[0];
    }
}
