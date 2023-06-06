package oops.objectparameter.pen;

public class PenService {

    public void penInformation(Pen p){
        System.out.println("Pen Company : " + p.getPenCompany());
        System.out.println("Pen Type : " + p.getPenType());
        System.out.println("Pen Color: " + p.getPenInk());
        System.out.println(" Price : " + p.getPrice());

    }
}
