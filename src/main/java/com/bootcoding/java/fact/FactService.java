package com.bootcoding.java.fact;

public class FactService {
    public  long getFact(long num){
        long fact =1;
        for(int i =1;i<=num;i++){
            fact=fact*i;


        }
        return fact;

    }
    public long[] getFacts (long[]nums){
        long res[]=new long[nums.length];
        for (int i =0;i< nums.length;i++){
            res[i]=getFact(nums[i]);

        }
        return res;

    }


    public  void printFact(long[]nums){
        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i] + ",");

        }
    }

    }


