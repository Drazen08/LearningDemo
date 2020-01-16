package com.study.leetcode.c6;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V1.0
 * @author: sunjx
 * @create: 2019/11/15
 */
public class Z字形变换 {

    /**
     * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
     * <p>
     * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
     * <p>
     * L   C   I   R
     * E T O E S I I G
     * E   D   H   N
     * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
     * <p>
     * 请你实现这个将字符串进行指定行数变换的函数：
     * <p>
     * string convert(string s, int numRows);
     * 示例 1:
     * <p>
     * 输入: s = "LEETCODEISHIRING", numRows = 3
     * 输出: "LCIRETOESIIGEDHN"
     * 示例 2:
     * <p>
     * 输入: s = "LEETCODEISHIRING", numRows = 4
     * 输出: "LDREOEIIECIHNTSG"
     * 解释:
     * <p>
     * L     D     R
     * E   O E   I I
     * E C   I H   N
     * T     S     G
     */

    public String convert(String s, int numRows) {
        if (numRows == 0) {
            return "";
        }
        int x = s.length() / (numRows + 1);
        int y = s.length() - (x * numRows);
        int[] all = new int[x + y];
        boolean f = true;
        StringBuffer result = new StringBuffer();
        for (int i = 1; i <= (x + y); i++) {
            if (f) {

            } else {

            }
        }

        return null;
    }

    /**
     * 按行排序
     */
    public String convert1(String s, int numRows) {
        if (numRows == 1) return s;
        List<StringBuilder> rows = new ArrayList<>();
        // 确定行数，占好格子
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }


    public String convert2(String s,int numRows){


        return null;

    }


    public static void main(String[] args) {
        System.out.println(1 / 3);
    }
}
