package com.bootcoding.java.array;

public class ArraySum {




    public  static void arraySum(int arr [],int  arr2[]) {
        int sum1 = 0;
        int sum2=0;

        for (int i = 0; i < arr.length; i++) {

            sum1 = sum1 + arr[i];

        }
        System.out.println("Sum Of 1st Array " + sum1);
        for (int i = 0; i < arr2.length; i++) {

            sum2 = sum2 + arr2[i];

        }
        System.out.println("Sum Of 2nd Array " +sum2);
    }
    public static void main (String[] args) {

        int arr[]={21,44,4,2};
        int arr2[]={11,44,5,2};
        arraySum(arr,arr2);

    }

}