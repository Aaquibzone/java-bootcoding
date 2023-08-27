package com.bootcoding.java.array;

public class CopyArrayAtoB {
    public static void main(String[] args) {


        int[] a = {1, 5, 4, 7, 8};
        int b []=new int[a.length] ;

        int i;

        for ( i = 0; i < a.length; i++) {
            b[i] =  a[i];
        }

        for ( i = 0; i < b.length; i++) {
            System.out.println( b[i]);
        }
        for ( i = 0; i < a.length; i++) {
            System.out.println( a[i]);
        }




    }





}
