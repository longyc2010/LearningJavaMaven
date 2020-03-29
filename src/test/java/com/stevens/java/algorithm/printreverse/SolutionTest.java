package com.stevens.java.algorithm.printreverse;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void printReverse() {

        Solution solution = new Solution();
        char[] input = {'a', 'b', 'c', 'c'};
        solution.printReverse(input);
    }
}