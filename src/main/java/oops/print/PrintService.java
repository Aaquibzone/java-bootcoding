package oops.print;

public class PrintService {
    public static  void print(String a){

        System.out.println(a);
    }
    public static void print(String a[]){
        for (int i=0; i<a.length;i++){
            System.out.println(a[i]);

        }
    }
    public static void printTable(int a){
        for (int i= 1;i<=10;i++) {
            System.out.println(a + " * " + a + " = " + a*i);
        }

    }
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public  void printFact(long[]nums){
        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i] + ",");

        }
    }
    public  void printFact(double[]nums){
        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i] + ",");

        }
    }

}
