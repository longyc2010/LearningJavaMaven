package com.stevens.java.algorithm.climbstairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer, Integer> cache = new HashMap<>();

    public int climbStairs(int n) {
        return climb(n - 1) + climb(n - 2);
    }

    private int climb(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (cache.get(n) != null) {
            return cache.get(n);
        }
        int result = climb(n - 1) + climb(n - 2);
        cache.put(n, result);
        return result;
    }
}
