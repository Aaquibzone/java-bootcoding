package com.bootcoding.java.Recursion;

public class RecursionEx2 {
    public static void main(String[] args) {
        printEven(4);
        System.out.println("Accending");
        printEvenAcending(8);
    }
    public static void printEven(int n){
        // Must have Base Condition or Termination Condition
        if(n  == 0){
            return ; // exit
        }
         if(n%2==0) {
             System.out.println("number is even" + n);
         }// calling itself (recursion call)
        printEven(n-1);
    }

    public static void printEvenAcending(int n){

        if(n  == 0){
            return ; // exit

        }
        printEvenAcending(n-1);
        if(n%2==0) {

            System.out.println("number is even" + n);
        }

    }
}

