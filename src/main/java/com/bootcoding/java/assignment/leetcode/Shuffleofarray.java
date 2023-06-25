package com.bootcoding.java.assignment.leetcode;

public class Shuffleofarray {

        public int[] shuffle(int[] nums, int n) {

            int[] arr = new int[2 * n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                arr[count] = nums[i];
                arr[count + 1] = nums[i + n];
                count += 2;



            }
            return arr;



        }
    public static int[] printArray(int[] a){

            for (int i=0;i<= a.length;i++){
                System.out.println(a[i]);
            }
            return a;



    }

    public static void main(String[] args) {
            Shuffleofarray so = new Shuffleofarray();

        int a[]= {6,5,4,3,2,1};
       // int res[]=so.shuffle(printArray(a),3);

        System.out.println(so.shuffle(printArray(a),2));
    }

}
