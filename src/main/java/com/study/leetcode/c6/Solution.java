package com.study.leetcode.c6;

/**
 * @version V1.0
 * @author: sunjx
 * @create: 2019/11/15
 */
public class Solution {

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
            if(f){

            }else{

            }
        }

        return null;
    }

}
