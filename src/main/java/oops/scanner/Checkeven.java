package oops.scanner;

import java.util.Scanner;

public class Checkeven {

    public static void checkArray(int arr[])
        {
            for (int i =0;i<arr.length;i++) {

                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is even");
                } else
                {
                    System.out.println(arr[i]+ " is  odd number!");
                }

            }

        }


        public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);

            System.out.print("Enter the size of array: ");
            int size = reader.nextInt();
            System.out.println("enter the elements of array");
            int arr[] = new int[size];
            for (int i=0;i< arr.length;i++) {
                System.out.println("Enter elements at index : " + i + "=");
                arr[i] = reader.nextInt();


            }

            checkArray(arr);
        }
    }
