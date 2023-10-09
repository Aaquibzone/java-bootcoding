package oops.even;

public class EvenNum {


    public  boolean isEven(int num){
        if(num%2==0){

            return true;
        }
        return false;
    }
     boolean allEven(int num[]) {
       for(int i=0;i< num.length;i++)
       {
           System.out.println(num[i]);
           if (num[i]%2==0) {
               return true;
           }

       }

         return false;
     }
}
