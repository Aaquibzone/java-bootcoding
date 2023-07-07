package oops.scanner;
import java.util.Scanner;
public class ScannerArray {
    public static boolean isEven(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
            {
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        System.out.println("enter the elements of array");
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter elements at index : " +i + "=");
            arr[i] =sc.nextInt();
            boolean res = isEven(arr);
            if(res){
                System.out.println(arr[i] + "  is a even number!");
            } else if (res) {

                System.out.println(arr[i]+ " is  odd number!");
            }

        }
    }
}







