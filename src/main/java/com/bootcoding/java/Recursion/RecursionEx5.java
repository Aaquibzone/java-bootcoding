package com.bootcoding.java.Recursion;
import java.util.Scanner;
public class RecursionEx5  {
    public static int findFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
    public static void main(String[] args) {
        while (true) {

            System.out.println("enter number ");
            Scanner sc= new Scanner(System.in);
            int num =sc.nextInt();
            if(num<0)
            {
                break;
            }
            int result = findFactorial(num);
            System.out.println(result);
        }
    }
}