package com.study.leetcode.c4;

import java.util.Arrays;

/**
 * Created by S on 2019/1/21.
 */
class Solution {
    /*
      给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。

      请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。

      你可以假设 nums1 和 nums2 不会同时为空。

      示例 1:

        nums1 = [1, 3]
        nums2 = [2]

        则中位数是 2.0
        示例 2:

        nums1 = [1, 2]
        nums2 = [3, 4]

        则中位数是 (2 + 3)/2 = 2.5
     */


    /**
     * 首次提交，结果满足要求，但是时间复杂度不满足
     * 将两个数组合并，两个有序数组的合并也是归并排序中的一部分。然后根据奇数，还是偶数，返回中位数
     */
    private double findMedianSortedArrays0(int[] nums1, int[] nums2) {
        int[] finalArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, finalArray, 0, nums1.length);
        System.arraycopy(nums2, 0, finalArray, nums1.length, nums2.length);
        Arrays.sort(finalArray);
        int l = finalArray.length;
        if (l == 0) {
            return 0D;
        }
        if (l % 2 == 0) {
            // 偶数
            return (double) (finalArray[(l / 2) - 1] + finalArray[(l / 2)]) / 2;
        } else {
            // 奇数
            return (double) finalArray[(l / 2)];
        }
    }

    /**
     * 不合并两个数组，求中位数
     */
    private double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int left = (n + m + 1) / 2;
        int right = (n + m + 2) / 2;
        //将偶数和奇数的情况合并，如果是奇数，会求两次同样的 k 。
        return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, left) + getKth(nums1, 0, n - 1, nums2, 0, m - 1, right)) * 0.5;
    }

    private int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        //让 len1 的长度小于 len2，这样就能保证如果有数组空了，一定是 len1
        if (len1 > len2) return getKth(nums2, start2, end2, nums1, start1, end1, k);
        if (len1 == 0) return nums2[start2 + k - 1];

        if (k == 1) return Math.min(nums1[start1], nums2[start2]);

        int i = start1 + Math.min(len1, k / 2) - 1;
        int j = start2 + Math.min(len2, k / 2) - 1;

        if (nums1[i] > nums2[j]) {
            return getKth(nums1, start1, end1, nums2, j + 1, end2, k - (j - start2 + 1));
        } else {
            return getKth(nums1, i + 1, end1, nums2, start2, end2, k - (i - start1 + 1));
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        double medianSortedArrays = solution.findMedianSortedArrays(new int[]{1}, new int[]{});
//        double medianSortedArrays = solution.findMedianSortedArrays(new int[]{1,3}, new int[]{2});
        System.out.println(medianSortedArrays);

    }


}
