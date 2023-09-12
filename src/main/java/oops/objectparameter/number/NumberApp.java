package oops.objectparameter.number;

public class NumberApp {
    public static void main(String[] args) {
        Number n1 = new Number();
        n1.setA(10);
        n1.setB(2);

        NumberService ns=new NumberService();
        ns.getAdd(n1);
        ns.getDiv(n1);
        ns.getMul(n1);
        ns.getAdd(n1);








    }

}
