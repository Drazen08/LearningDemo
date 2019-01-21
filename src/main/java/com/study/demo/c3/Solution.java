package com.study.demo.c3;


import java.util.*;

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
     * 第一次成功！！！！但是好像有点慢  4834 ms 为啥这么慢？？
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        List<Character> current = new ArrayList<Character>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int index = current.indexOf(a);
            if (index != -1) {
                max = max > current.size() ? max : current.size();
                current = current.subList(index + 1, current.size());
            }
            current.add(a);
        }
        return max > current.size() ? max : current.size();
    }

    /**
     * 当List<Character> 换成 StringBuffer 时，仅用时61ms，速度提高了快100倍。。
     * @param s
     * @return
     */
    int lengthOfLongestSubstring2(String s){
       StringBuffer sb = new StringBuffer();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String a = String.valueOf(s.charAt(i));
            int index = sb.indexOf(a);
            if (index != -1) {
                max = max > sb.length() ? max : sb.length();
                int length = sb.length();
                sb.append(sb.substring(index + 1, sb.length()));
                sb.delete(0,length);
            }
            sb.append(a);
        }
        return max > sb.length() ? max : sb.length();
    }


    /*------------------------------------------------------------------------
    * 现在分析一下官方的方法
    *
    */

    // 唉看不懂看不懂
    int lengthOfLongestSubstring3(String s){
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }


    public int lengthOfLongestSubstring4(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    /**
     * 字符集的解法，秀
     * 假设字符集为 ASCII 128
     * int [26] 用于字母 ‘a’ - ‘z’或 ‘A’ - ‘Z’
     * int [128] 用于ASCII码
     * int [256] 用于扩展ASCII码
     * @param s
     * @return
     */
    int lengthOfLongestSubstring5(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }



    public static void main(String[] args) {
        String param = "pwwkew";
        Solution s = new Solution();
        int r = s.lengthOfLongestSubstring3(param);
        System.out.println(r);
    }
}
