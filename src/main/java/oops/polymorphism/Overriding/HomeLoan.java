package oops.polymorphism.Overriding;

public class  HomeLoan extends BaseLoan {
    public double calculateROI(){
        System.out.println("Child method Invoked");
        return 9.5;
    }
}
