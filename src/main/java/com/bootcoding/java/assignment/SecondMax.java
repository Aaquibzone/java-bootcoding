package com.bootcoding.java.assignment;

public class SecondMax {
    public static void main(String[] args) {
        int[] a = {5, 9, 10, 2, 33};
        int max = a[0];
        int premax = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                premax = max;
                max = a[i];
            }

    }
        System.out.println(max);
    }
}