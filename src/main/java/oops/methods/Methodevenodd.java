package oops.methods;

public class Methodevenodd {

      public static void checkNumber(int n){
          if (n%2==0)
          {
              System.out.println("The Entered Number is Even " + n);

          }
          else
          {
              System.out.println("The Entered Number is Odd " + n);
          }
      }

    public static void main(String[] args) {
          checkNumber(5);


    }
}
