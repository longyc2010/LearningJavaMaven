package com.stevens.java.zigzagconversion;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        int length = s.length();
        int rowLen = Math.min(numRows, length);
        // 初始化一个StringBuffer的数组，分别保存每一行的字符串
        List<StringBuilder> data = new ArrayList<>(rowLen);

        for (int i = 0; i < rowLen; i++) {
            data.add(new StringBuilder());
        }
        int index = 0;
        int flag = -1;
        for (int i = 0; i < length; i++) {
            index = index % numRows;
            if (index == numRows - 1 || index == 0) {
                flag = -flag;

            }
            data.get(index).append(s.charAt(i));
            index += flag;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rowLen; i++) {
            result.append(data.get(i));
        }
        return result.toString();
    }
}
