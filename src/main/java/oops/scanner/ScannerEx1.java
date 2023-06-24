package oops.scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static boolean isPrime(int val) {
        for( int i = 2; i < val; i++){
            if(val % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        // How to create an instance / object of a Scanner
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();

        boolean res = isPrime(x);
        if (res ==true){
            System.out.println(x + " is a prime number ");
        }
        else {

            System.out.println(x + " is  not a prime number ");
        }


    }

}