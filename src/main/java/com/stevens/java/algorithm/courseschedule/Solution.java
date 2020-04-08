package com.stevens.java.algorithm.courseschedule;

import java.util.*;

public class Solution {

    private class Node {
        List<Integer> postList = new ArrayList<>();
        int indegree = 0;
        int id = 0;

        public Node(int id) {
            this.id = id;
        }

    }

    /**
     * D --> C --> B
     * A -->B
     * 要学B，必须先学习C，要学习C，必须先学习D
     * B 的入度 为 2, 邻接表 []
     * C 的入度 为 1, 邻接表[B]
     * D 的入度 为 0 [C]
     * A 的入度为 0 [B]
     *
     * @param numCourses
     * @param prerequisites
     * @return
     */

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer, Node> matrix = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            matrix.put(i, new Node(i));
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int[] values = prerequisites[i];
            int current = values[0];
            int pre = values[1];
            matrix.get(pre).postList.add(current);
            matrix.get(current).indegree += 1;
        }

        for (Node node : matrix.values()) {
            if (node.indegree == 0) {
                queue.add(node);
            }
        }

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            numCourses--;
            for (int id : node.postList) {
                Node pre = matrix.get(id);
                pre.indegree -= 1;
                if (pre.indegree == 0) {
                    queue.add(pre);
                }
            }
        }


        return numCourses == 0;
    }


}
