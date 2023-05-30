package com.bootcoding.java.pattern;

public class DiamondStarPattern {
    public static void main(String[] args) {
        int i,j,k;
        for (i=1;i<=5;i++) //rows
        {
            for ( j=5;j>i;j--)  //sapce and collumn
            {
                System.out.print(" ");
            }
            for ( k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        for (i=4;i>=1;i--) //rows
        {
            for ( j=5;j>i;j--)  //sapce and collumn
            {
                System.out.print(" ");
            }
            for ( k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
