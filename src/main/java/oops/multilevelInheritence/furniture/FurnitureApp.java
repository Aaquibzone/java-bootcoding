package oops.multilevelInheritence.furniture;

public class FurnitureApp {
    public static void main(String[] args) {
        LShapeSofa lf=new LShapeSofa();
        lf.color="color";
        lf.Type="L Type";
        lf.Cloth="Cotton";


        ComputerTable ct=new ComputerTable();
        ct.color="Brown";
        ct.drawer=2;
        ct.leg=2;


        ct.sofaSale();
    }
}
