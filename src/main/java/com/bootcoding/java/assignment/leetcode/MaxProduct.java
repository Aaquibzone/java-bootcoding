package com.bootcoding.java.assignment.leetcode;

import java.util.Arrays;

public class MaxProduct {

    public int maxProduct(int [] arr) {


        int n= arr.length;
        Arrays.sort(arr);
        int max1=arr[0]*arr[1]*arr[n-1];
        int max2=arr[n-1]*arr[n-2]*arr[n-3];

        return Math.max(max1,max2);
        }


    public static void main(String[] args) {

        int arr[]={-20,-10,5,8,9};
        MaxProduct m=new MaxProduct();
        System.out.println(m.maxProduct(arr));
    }


}
