package oops.factorial;

public class FactorialApp {
    public static void main(String[] args) {
        FactorialService fact =new FactorialService();
       // int res =  fact.getFact(3);
       // System.out.println( res);
        int []nums ={2,3,4,5};
        //System.out.println(" Array of Number :"+fact.getFacts(nums));
        fact.printFacts(nums,3);
    }

}
