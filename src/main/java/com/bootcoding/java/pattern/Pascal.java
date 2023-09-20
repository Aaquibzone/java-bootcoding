package com.bootcoding.java.pattern;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        System.out.println("Enter the Number of rows");
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        int value=0;

        //pattern
        for (int i =0;i<rows;i++){
            for (int s =0;s<(rows-i-1);s++) // spaces
            {
                System.out.print(" ");
            }
            for (int j =0;j<=i;j++)     //values
            {
                value= binomialCoeficient(i,j);
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    static int binomialCoeficient(int line, int col) //line == rows
    {
        if(col==0 || line==col){
            return 1;
        }
        else {
          return  ( binomialCoeficient(line-1,col-1)+binomialCoeficient(line-1,col));
        }
    }
}
