package oops.prime;

public class PrimeNumber {


    public boolean isPrime(int num) {
        boolean flag = false;


        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }
    public boolean allPrime(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            boolean res = isPrime(numbers[i]);
            if(!res){
                return false;
            }
        }
        return true;

    }
}






