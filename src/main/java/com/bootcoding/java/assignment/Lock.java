package com.bootcoding.java.assignment;

public class Lock {


        String lockModelno;
        String lockType;
        int price;


        public static void lockSpecification(String lockModelno,String lockType,int price)
        {
            System.out.println("Lock MOdel No :  " + lockModelno);
            System.out.println("Lock Type: " + lockType);
            System.out.println("Lock Price : " + price);

        }

    @Override
    public String toString() {
        return "Lock{" +
                "lockModelno='" + lockModelno + '\'' +
                ", lockType='" + lockType + '\'' +
                ", price=" + price +
                '}';
    }
}

