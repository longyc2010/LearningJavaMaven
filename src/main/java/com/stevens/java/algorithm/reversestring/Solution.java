package com.stevens.java.algorithm.reversestring;

public class Solution {

    public char[] reverseString(char[] s) {

        for (int i = 0; i < s.length; i++) {
            if (i > s.length - i - 1) {
                break;
            }
            swap(i, s.length - i - 1, s);
        }
        return s;
    }

    private void swap(int left, int right, char[] s) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
}
