package oops.methods;



public class MethodEx1 {
    public static int smallestNumber(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println("a is smallest " + a);
            return a;
        } else if (b < a && b < c) {

            System.out.println("b is smallest " + b);
            return b;
        } else {
            System.out.println("c is the smallest " + c);
            return c;
        }
    }

    public static void main(String[] args) {

        smallestNumber(7, 5, 8);
    }

}



