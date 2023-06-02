package oops.methods;


import java.util.Scanner;

public class MaxElementMethod {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = scanner.nextInt();

        int[] arr=takeArrayFromUser(n,scanner);
        int res=0;
        res=findmaxElement(arr);
        System.out.println("The max element is " + res);


    }

    public static int[] takeArrayFromUser(int n, Scanner scanner)
    {
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter number of Elements at ["+ i +"]");
            arr[i]=scanner.nextInt();
        }
        return arr ;
    }
    public static int findmaxElement(int []arr){

        int max=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(max<arr[i]){

                max=arr[i]; //set by  max valued
            }
        }
       // System.out.println(max);
        return max;

    }


}
