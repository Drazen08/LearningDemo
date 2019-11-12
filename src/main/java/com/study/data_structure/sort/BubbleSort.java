package com.study.data_structure.sort;

import java.util.Random;
import java.util.Vector;

/**
 * Created by S on 2019/7/12.
 */
public class BubbleSort {

    void bubbleSort(int[] a, int n) {
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 1; i < n; i++) {
                if (a[i - 1] > a[i]) {
                    swap(a[i - 1], a[i]);
                    sorted = false;
                }
            }
            n--;
        }
    }


    private void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }

    public static void main(String[] args) {
        Vector v = new Vector();

    }

}
