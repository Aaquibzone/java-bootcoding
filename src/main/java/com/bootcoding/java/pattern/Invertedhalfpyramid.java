package com.bootcoding.java.pattern;

public class Invertedhalfpyramid {
    public static void main(String[] args) {
        int n=4;
        for (int i=1;i<=n;i++){

            for (int j=1;j<=n-i;j++)
                //innr loop space print

                {
                    System.out.print(" ");
                }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
