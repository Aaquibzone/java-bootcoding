package oops.prime;

public class PrimeApp {


    public static void main(String[] args) {
        PrimeNumber obj= new PrimeNumber();
        System.out.println(obj.isPrime(13));

        int []a= {5,12,11,10};
        System.out.println(obj.allPrime(a));
    }
}

