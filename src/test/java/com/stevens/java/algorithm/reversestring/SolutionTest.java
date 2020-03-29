package com.stevens.java.algorithm.reversestring;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void reverseString() {

        Solution solution = new Solution();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] result = solution.reverseString(input);

        Assert.assertArrayEquals("reverseString", new char[]{'o', 'l', 'l', 'e', 'h'}, result);
    }
}