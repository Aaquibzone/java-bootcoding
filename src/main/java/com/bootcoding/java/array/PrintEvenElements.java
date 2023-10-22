package com.bootcoding.java.array;

public class PrintEvenElements {

    public static void evenElements(int a[],int b[]) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {

                System.out.println(a[i]);
            }

        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {

                System.out.println(b[i]);

            }

        }

    }




    public static void main(String[] args) {
        int a[]={2,5,6,1};
        int b[]={4,3,2,1};

         evenElements(a,b);
    }
        }
