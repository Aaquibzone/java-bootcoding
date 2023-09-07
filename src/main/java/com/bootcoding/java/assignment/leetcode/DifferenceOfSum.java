package com.bootcoding.java.assignment.leetcode;

//Difference Between Ele
public class DifferenceOfSum {


    public  static int sumOfElements(int []arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

        }
        System.out.println(sum);
        return sum;
    }

        public  static int SumOfDigit(int []arr) {
            int rem=0;

            int i = 0;
            for (i=0;i< arr.length;i++)
            while(arr[i]!=0)
            {
                rem=rem +arr[i]%10 ;
                arr[i]=arr[i]/10;

            }
            System.out.println(rem);
            return rem;


        }


    public static void main (String[] args) {

    int arr[]={21,44,4,2};
    int  elements =sumOfElements(arr);
    int digit=SumOfDigit(arr);
    int differnce= elements-digit;




        System.out.println("Difference Between Element Sum and Digit Sum of an Array is  " + differnce);




 }

}