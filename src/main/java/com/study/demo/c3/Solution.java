package com.study.demo.c3;

import java.util.HashSet;
import java.util.LinkedList;
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

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        List<String> list = new LinkedList<String>();
        for (int i = 0; i < s.length(); i++){
            String r = s.substring(0,i+1);
            int index = list.indexOf(r);
            if(index != -1){
                result = i - index;
                break;
            }else{
                list.add(r);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String param = "pwwkew";
        Solution s = new Solution();
        int r = s.lengthOfLongestSubstring(param);
        System.out.println(r);
    }
}
