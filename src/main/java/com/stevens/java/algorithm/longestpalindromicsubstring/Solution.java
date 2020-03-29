package com.stevens.java.algorithm.longestpalindromicsubstring;

public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int startIndex = 0;
        int endIndex = 0;
        int maxL = 0;
        for (int i = 0; i < s.length(); i++) {

            int mLength = computeMiddleLength(s, i, i);
            int dLength = computeMiddleLength(s, i, i + 1);
            int maxLength = Math.max(mLength, dLength);
            if (maxLength > maxL) {
                maxL = maxLength;
                startIndex = i - (maxLength - 1) / 2;
                endIndex = i + maxLength / 2 + 1;
            }


        }
        return s.substring(startIndex, endIndex);
    }

    private int computeMiddleLength(String s, int left, int right) {
        int leftIndex = left;
        int rightIndex = right;

        while (leftIndex >= 0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex)) {
            leftIndex--;
            rightIndex++;
        }

        return rightIndex - leftIndex - 1;
    }
}
