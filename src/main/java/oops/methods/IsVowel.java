package oops.methods;


import java.util.Scanner;

public class IsVowel {
    public static boolean isVowel(char letter) {
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        int size = vowel.length;
        for (int i = 0; i < size; i++) {
            if ( letter ==vowel[i]){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character " );
        char letter = sc.next().charAt(0);

        boolean res =isVowel(letter);
        System.out.println(res);

    }

}
