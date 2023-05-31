package com.bootcoding.java.assignment;

import java.util.Scanner;

public class PositiveNegCount {

    public static void  checkNO(int x){
        if(x>=0)
        {
            System.out.println( "No is positive" + x);
        }
        else
            System.out.println("No is negative" + x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        int e = sc.nextInt();

          checkNO(a);

    }
}
