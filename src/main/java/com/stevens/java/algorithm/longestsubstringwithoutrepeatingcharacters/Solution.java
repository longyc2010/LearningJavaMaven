package com.stevens.java.algorithm.longestsubstringwithoutrepeatingcharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int startIndex = -1;
        int maxSubLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (charMap.containsKey(ch)) {
                int index = charMap.get(ch);
                if (index >= startIndex) {
                    maxSubLength = Math.max(maxSubLength, i - startIndex - 1);
                    startIndex = index;
                }
            }
            charMap.put(ch, i);
        }
        if (startIndex < s.length()) {
            maxSubLength = Math.max(maxSubLength, s.length() - startIndex - 1);
        }

        return maxSubLength;
    }
}
