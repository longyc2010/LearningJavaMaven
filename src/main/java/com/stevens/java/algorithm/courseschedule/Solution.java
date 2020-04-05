package com.stevens.java.algorithm.courseschedule;

import java.util.*;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer, Integer> outNum = new HashMap<>();
        Map<Integer, List<Integer>> inNodes = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        int rows = prerequisites.length;
        for (int i = 0; i < rows; i++) {
            int key = prerequisites[i][0];
            int value = prerequisites[i][1];
            set.add(key);
            set.add(value);
            if (!outNum.containsKey(key)) {
                outNum.put(key, 0);
            }

            if (!outNum.containsKey(value)) {
                outNum.put(value, 0);
            }

            int num = outNum.get(key);
            outNum.put(key, num + 1);

            if (!inNodes.containsKey(value)) {
                inNodes.put(value, new ArrayList<>());
            }
            inNodes.get(value).add(key);
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int k : set) {
            if (outNum.get(k) == 0) {
                queue.offer(k);
            }
        }
        while (!queue.isEmpty()) {
            int v = queue.poll();
            List<Integer> list = inNodes.getOrDefault(v, new ArrayList<>());
            for (int k : list) {
                int num = outNum.get(k);
                if (num == 1) {
                    queue.offer(k);
                }
                outNum.put(k, num - 1);
            }

        }

        for (int k : set) {
            if (outNum.get(k) != 0) {
                return false;
            }
        }

        return false;
    }
}
