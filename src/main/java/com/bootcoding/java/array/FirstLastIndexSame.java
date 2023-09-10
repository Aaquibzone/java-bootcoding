package com.bootcoding.java.array;

public class  {FirstLastIndexSame
    public static void main(String[] args) {

        int arr[] = {1, 5, 4, 7, 5,5};
        int size = arr.length;
        for (int i = 0; i < size; i++) {

            if (arr[0] == arr[size - 1]) {

                System.out.println(arr[i]);
            }
        }
        System.out.println("First  Index & Last Index Is Same of  Array");

    }
}
