package oops.methods;


import java.util.Random;

public class FactorialMethod {

     public static void findfactorial(int x){


         int res=1;

         for (int i = 1; i <=x; i++) {
             res  =res *i;
         }
         System.out.println("factorial of " + x + " is " + res);
     }
    public static void main(String[] args) {
        Random random =new Random();



        findfactorial(random.nextInt(10));

    }
}
