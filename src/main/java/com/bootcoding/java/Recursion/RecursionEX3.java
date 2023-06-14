package com.bootcoding.java.Recursion;
// print factorial using Recursion

public class RecursionEX3 {
    public static void main(String[] args) {

        int res =printFactorial(4);
        System.out.println("the factorial of  give no is " + res) ;
   }
    public static int printFactorial(int n) {

//        if(n<=1)
//        {
//            return 1 ;
//        }
//        else {
//            return n*printFactorial(n-1);
//        }

        if(n==1) {
            return 1;
        }
        return n*printFactorial(n-1);
        }


    }

