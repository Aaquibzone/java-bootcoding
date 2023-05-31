package com.bootcoding.java;

/*
2) Take year array and convert it into months and print year to months result
years = [1, 2.5, 3.2, 10.5, 15]
Output:
1 years -> 12 months (for all elements)
 */
public class YeartoMonths {

    public static void main(String[] args){

        double []  years ={1,2.5,3.2,1.5,15};
                int size =years.length;

                for (int i =0;i<size;i++)
                {
                     double months =years[i]*12.0;
                    System.out.println(months);
                }
    }
}
