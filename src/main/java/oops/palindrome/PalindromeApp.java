package oops.palindrome;

public class PalindromeApp {
    public static void main(String[] args) {

        PalindromeServices p1= new PalindromeServices();
        p1.getPalindrome(121);
        System.out.println(p1.getPalindrome(121));



        int[] arr= {121,222,333,122};
       int []res= p1.getMultipleNumber(arr);



        p1.printArray(res);




    }
}
