package oops.objectparameter.number;

public class NumberService {
    public void  getAdd(Number n1){
        n1.c= n1.getA()+ n1.getB();
        System.out.println(n1.c);

    }
    public void  getSub(Number n1){
        n1.c= n1.a- n1.b;
        System.out.println("Substraction of " +n1.a + " And " + n1.b + " is " +n1.c);
    }
    public void  getMul(Number n1){
        n1.c= n1.a* n1.b;
        System.out.println(n1.c);
    }
    public void  getDiv(Number n1){
        n1.c= n1.a / n1.b;
        System.out.println(n1.c);
    }
}
