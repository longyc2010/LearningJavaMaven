package com.stevens.java.zigzagconversion;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void convert() {
        Solution solution = new Solution();
        String input = "LEETCODEISHIRING";
        int num = 3;
        String output = solution.convert(input, num);
        Assert.assertEquals("Z", "LCIRETOESIIGEDHN", output);
    }

    /**
     * 输入: s = "LEETCODEISHIRING", numRows = 4
     * 输出: "LDREOEIIECIHNTSG"
     */

    @Test
    public void convert2() {
        Solution solution = new Solution();
        String input = "LEETCODEISHIRING";
        int num = 4;
        String output = solution.convert(input, num);
        Assert.assertEquals("Z", "LDREOEIIECIHNTSG", output);
    }
}