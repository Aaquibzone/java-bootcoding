package oops.PowerMath;

public class PowerApp {
    public static void main(String[] args) {

        PowerService power = new PowerService();

        System.out.println(power.powerService(5));
        double arr[]= {2.2,5.2,2.2,5};


      power.PrintMethod(arr);
    }
}
