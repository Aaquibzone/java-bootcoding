package com.bootcoding.java.assignment.leetcode;

import static java.lang.Math.max;

public class MaxConsecutiveOnes {

   int findMaxConsecutiveOnes(int arr[]) {

       int count =0;
       int ans=0;

        for(int i=0;i< arr.length;i++){
            if (arr[i]==0)
            {
                count=0;

            }
            else {
                count++;
                ans=max(ans,count);
            }
        }



        return ans;
    }

    public static void main(String[] args) {

       MaxConsecutiveOnes mc= new MaxConsecutiveOnes();
        int arr[]={1,1,0,1,1,1,0,1};

        System.out.println(mc.findMaxConsecutiveOnes(arr));



    }


}
