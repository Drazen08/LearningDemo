package com.study.demo.c1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sunjx
 * @Date 2018/9/28 15:43
 */
public class Solution {

    /**
     * 给定一个整数数组，返回两个数字的索引，使它们相加到特定目标。
     * 您可以假设每个输入只有一个解决方案，并且您可能不会两次使用相同的元素。
     * 例：
     * 给定nums = [2,7,11,15]，target = 9，
     * 因为nums [ 0 ] + nums [ 1 ] = 2 + 7 = 9，
     * 返回[ 0，1 ]。
     */


    /**
     * 这是最慢的版本 3% faster
     *
     * @param nums
     * @param target 两个数之和
     * @return
     */
    public static int[] twoSum0(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                int b = nums[j];
                if (a + b == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 稍微好一点 6% faster
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 好多了 39%，时间受参数影响
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j < nums.length) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
                j++;
            }
        }
        return null;
    }

    /**
     * 43.52% 看来用Map更快
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum3(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] params = new int[]{2, 7, 11, 15};
        int[] result = Solution.twoSum2(params, 18);
        System.out.println(Arrays.toString(result));
    }

}
