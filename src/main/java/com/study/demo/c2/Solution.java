package com.study.demo.c2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by S on 2018/11/4.
 */
class Solution {

    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order and each of their nodes contain a single digit.
     * Add the two numbers and return it as a linked list.
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     */

    /**
     * 给定两个非空链表，表示两个非负整数。这些数字以相反的顺序存储，
     * 它们的每个节点都包含一个数字。
     * 添加这两个数字并以链表的形式返回。
     * 您可以假设这两个数字不包含任何前导零，除了数字0本身。
     * <p>
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     */

    /**
     * 解决方案 第一次的
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<ListNode> r = new ArrayList<ListNode>();
        int temp = 0;
        ListNode rrr = new ListNode(0);
        ListNode result = rrr;
        while (l1 != null && l2!= null) {
            int i = l1.val + l2.val;
            if (temp > 0) {
                i += temp;
                temp = 0;
            }
            if (i >= 10) {
                temp++;
                i = i - 10;
            }
            r.add(new ListNode(i));
            l1 = l1.next;
            l2 = l2.next;
        }
        r.add(new ListNode(l1.val + l2.val + temp));
        for (int i = 0; i < r.size(); i++) {
            result.next = r.get(i);
            result = result.next;
        }
        return rrr.next;
    }

    /**
     * 能力有限，看的答案，唉。。。
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            this.val = x;
        }
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution s = new Solution();
        ListNode r = s.addTwoNumbers(l1, l2);
        System.out.println(r);
    }
}
