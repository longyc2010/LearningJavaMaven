package com.stevens.java.algorithm.coursescheduleii;

import java.util.*;

public class Solution {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses <= 0) {
            return new int[0];
        }
        int plen = prerequisites.length;
        if (plen == 0) {
            int[] ret = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                ret[i] = i;
            }
            return ret;
        }

        int[] marked = new int[numCourses];
        List<Set<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new HashSet<>());
        }
        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
        }
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (dfs(i, graph, marked, stack)) {
                return new int[0];
            }
        }
        int[] ret = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            ret[i] = stack.pop();
        }
        return ret;
    }

    private boolean dfs(int i, List<Set<Integer>> graph, int[] marked, LinkedList<Integer> stack) {
        if (marked[i] == 1) {
            return true;
        }

        if (marked[i] == 2) {
            return false;
        }

        marked[i] = 1;
        Set<Integer> successorNodes = graph.get(i);
        for (Integer successor : successorNodes) {
            if (dfs(successor, graph, marked, stack)) {
                return true;
            }
        }

        marked[i] = 2;
        stack.push(i);
        return false;


    }
}
