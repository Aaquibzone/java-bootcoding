package oops.armstrong;

import oops.print.PrintService;

public class ArmstrongApp {
    public static void main(String[] args) {
        ArmstrongServices a1= new ArmstrongServices();
        System.out.println(a1.getArmstrong(121));
        int []arr= {371,151,252};
        int [] res= a1.getMultipleNumber(arr);
        //a1.printArray(res);
        PrintService ps =new PrintService();
        ps.printArray(res);
    }
}
