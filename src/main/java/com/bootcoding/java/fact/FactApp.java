package com.bootcoding.java.fact;

public class FactApp {
    public static void main(String[] args) {

        FactService f1=new FactService();

        long []arr ={2,3,5,6};
        long [] res= f1.getFacts(arr);
        System.out.println("Input Array");
        f1.printFact(arr);
        System.out.println(" \n Output Array");
        f1.printFact(res);

        MultiplicationTableService m1=new MultiplicationTableService();
        long [] multiplicationTable=m1.getMultplication(10);
        System.out.println(" \n Mulplication of table");
        f1.printFact(multiplicationTable);




    }
}
