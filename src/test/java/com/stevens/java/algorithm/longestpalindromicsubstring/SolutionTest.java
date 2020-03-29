package com.stevens.java.algorithm.longestpalindromicsubstring;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void longestPalindrome() {
        Solution solution = new Solution();
        String input = "babad";
        String sub = solution.longestPalindrome(input);
        Assert.assertEquals("String equal", "bab", sub);
    }

    @Test
    public void longestPalindrome1() {
        Solution solution = new Solution();
        String input = "cbbd";
        String sub = solution.longestPalindrome(input);
        Assert.assertEquals("String equal", "bb", sub);
    }
}