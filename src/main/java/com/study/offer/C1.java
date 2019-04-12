package com.study.offer;

/**
 * @author sunjx
 * @Date 2019/4/12 10:49
 */
public class C1 {
    /**
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
     * 判断数组中是否含有该整数。
     */

    public boolean Find(int target, int[][] array) {

        int l = array.length;
        int sl = array[0].length;
        int min = array[0][0];
        int max = array[l - 1][sl - 1];
        if (target > max || target < min) {
            return false;
        }
        int middle = array[l / 2][sl - 1];


        return false;
    }
}
