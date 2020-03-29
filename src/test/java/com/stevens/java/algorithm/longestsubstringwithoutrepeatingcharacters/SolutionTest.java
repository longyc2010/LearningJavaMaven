package com.stevens.java.algorithm.longestsubstringwithoutrepeatingcharacters;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        Solution solution = new Solution();
        String input = "abcabcbb";
        int maxLength = solution.lengthOfLongestSubstring(input);
        Assert.assertEquals("equal", 3, maxLength);

    }

    @Test
    public void lengthOfLongestSubstring2() {
        Solution solution = new Solution();
        String input = "pwwkew";
        int maxLength = solution.lengthOfLongestSubstring(input);
        Assert.assertEquals("equal", 3, maxLength);

    }

    @Test
    public void lengthOfLongestSubstring3() {
        Solution solution = new Solution();
        String input = "bbbbbb";
        int maxLength = solution.lengthOfLongestSubstring(input);
        Assert.assertEquals("equal", 1, maxLength);
    }

    @Test
    public void lengthOfLongestSubstring4() {
        Solution solution = new Solution();
        String input = "a";
        int maxLength = solution.lengthOfLongestSubstring(input);
        Assert.assertEquals("equal", 1, maxLength);
    }

    @Test
    public void lengthOfLongestSubstring5() {
        Solution solution = new Solution();
        String input = "";
        int maxLength = solution.lengthOfLongestSubstring(input);
        Assert.assertEquals("equal", 0, maxLength);
    }

    @Test
    public void lengthOfLongestSubstring6() {
        Solution solution = new Solution();
        String input = " ";
        int maxLength = solution.lengthOfLongestSubstring(input);
        Assert.assertEquals("equal", 1, maxLength);
    }

    @Test
    public void lengthOfLongestSubstring7() {
        Solution solution = new Solution();
        String input = "abcdefg";
        int maxLength = solution.lengthOfLongestSubstring(input);
        Assert.assertEquals("equal", 7, maxLength);
    }
}