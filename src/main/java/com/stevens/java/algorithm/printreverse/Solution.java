package com.stevens.java.algorithm.printreverse;

public class Solution {

    void printReverse(char[] str) {
        printReverseLoop(0, str);

    }

    private void printReverseLoop(int index, char[] str) {

        if (index >= str.length) {
            return;
        }

        printReverseLoop(index + 1, str);
        System.out.print(str[index]);
    }

}
