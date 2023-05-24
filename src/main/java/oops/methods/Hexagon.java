package oops.methods;

import static java.lang.Math.expm1;
import static java.lang.Math.tan;


public class Hexagon {
    public static void m1(int num) {
        double area;
        area = (Math.pow(num, 2) * 6 )/ (Math.tan(Math.PI / 6) * 4);
        System.out.println(area);


    }


    public static void main(String[] args) {
        m1(6);
    }

}