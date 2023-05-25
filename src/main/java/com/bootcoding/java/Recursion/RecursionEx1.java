package com.bootcoding.java.Recursion;

public class RecursionEx1 {
    public static void main(String[] args) {
        System.out.println("using recursion (descending)");
        printDescending(5);
        System.out.println("using recursion (Ascending)");
        printAscending(5);
        System.out.println("USing For Loop");

        for(int i =0;i<=5;i++)
        {
            System.out.println(i);
        }

    }
    public static void printDescending(int n)
    {
        if(n==0){      // Must have Base Condition or Termination Condition
            return;
        }
        System.out.println(n);
        // calling itself (recursion call)
        printDescending(n-1);
    }

public static void printAscending(int n) {
    if (n == 0) {
        return;
    }
    printAscending(n - 1);
    System.out.println(n);

}
}
