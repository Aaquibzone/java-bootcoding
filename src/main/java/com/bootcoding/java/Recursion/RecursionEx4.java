package com.bootcoding.java.Recursion;

public class RecursionEx4
{
//WAP to print square of natural numbers upto given number using recursion

    public static void main(String[] args) {
        squareOfNaturalNo(5);

    }
    public static  void squareOfNaturalNo(int n)
    {
        if (n==0)
        {
            return ;
        }

         squareOfNaturalNo(n-1);
    if(n>0){
        int  k=n*n;
        System.out.println(n + "is a square of (" +k +")");
    }

        }




}
