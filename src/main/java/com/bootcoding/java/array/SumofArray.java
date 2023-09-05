package com.bootcoding.java.array;

public class SumofArray {
    public static void main(String[] args) {
        int arr[] = {5, 10, 12, 15, 2};
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println("sum of array : " + sum);
    }
}
