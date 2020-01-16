package com.study.leetcode.c7;

/**
 * @version V1.0
 * @author: sunjx
 * @create: 2020/1/16
 */
public class 整数反转 {

    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     * <p>
     * 示例 1:
     * <p>
     * 输入: 123
     * 输出: 321
     *  示例 2:
     * <p>
     * 输入: -123
     * 输出: -321
     * 示例 3:
     * <p>
     * 输入: 120
     * 输出: 21
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/reverse-integer
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param x
     * @return
     */


    public int reverse0(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }

    public static void main(String[] args) throws InterruptedException {
        整数反转 s = new 整数反转();
        for (int i = Integer.MAX_VALUE; i >= 0; i--) {
            int i1 = s.reverse0(i);
            System.out.println(i + "-->" + i1);
            Thread.sleep(1000);
        }
    }
}
