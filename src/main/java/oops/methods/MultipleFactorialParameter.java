package oops.methods;

import java.util.Random;

public class MultipleFactorialParameter {
    public static void findingFactorial(int a, int b, int c) {
        findingFactorial(a);
        findingFactorial(b);
        findingFactorial(c);
    }

    public static int findingFactorial(int num) {
        int factorial = 1;
        int originalNum = num;
        while (num > 0) {
            factorial = factorial * num;
            num--;
        }
        System.out.println("factorial of " + originalNum + " is " + factorial);
        return factorial;
    }

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            findingFactorial(random.nextInt(5), random.nextInt(7), random.nextInt(10));

        }


    }
}