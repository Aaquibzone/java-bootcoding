package oops.even;

public class EvenApp {

    public static void main(String[] args) {
        EvenNum e1=new EvenNum();

        System.out.println(e1.isEven(4));
        System.out.println(e1.isEven(3));

         int[] num ={12,5,6,7,8};

        System.out.println(e1.allEven(num));
    }
}
