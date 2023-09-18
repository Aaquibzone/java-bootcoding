package oops.palindrome;

public class PalindromeServices {

    public boolean getPalindrome(int num) {
        int rem = 0;
        int temp = num;

        while (num != 0) {
            rem = rem * 10 + num % 10;
            num = num / 10;

        }
       return  rem==temp;
        }


    public int[] getMultipleNumber(int[] arr) {
        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            if(getPalindrome(arr[i])) {
                result[i] = arr[i];

            }

        }
        return result;

    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
