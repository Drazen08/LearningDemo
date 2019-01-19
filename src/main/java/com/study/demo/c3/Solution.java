package com.study.demo.c3;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by S on 2018/11/7.
 */
class Solution {

    /**
     * Given a string, find the length of the longest substring without repeating characters.
     */

    /**
     * 给定一个字符串，在不重复字符的情况下查找最长子字符串的长度。
     * Example 1:
     * Input: "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * Example 2:
     * Input: "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * Example 3:
     * Input: "pwwkew"
     * Output: 3
     */


    /**
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        Set<Character> current = new HashSet<Character>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 == s.length()) {
                break;
            }

        }
        return max;
    }


    public static void main(String[] args) {
        String param = "pwwlew";
        Solution s = new Solution();
        int r = s.lengthOfLongestSubstring(param);
        System.out.println(r);
    }
}
