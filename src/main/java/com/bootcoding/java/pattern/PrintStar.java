package com.bootcoding.java.pattern;

public class PrintStar {
    public static void main(String[] args) {
        int n=4;
        for (int i=1;i<=n;i++)
        {
         for (int j=1;j<=i;j++)
         {
             System.out.print("*");
         }
            System.out.println();
        }                                //row no
        // is = total colum we need
    }
}
