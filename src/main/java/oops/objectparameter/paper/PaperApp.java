package oops.objectparameter.paper;

public class PaperApp {

    public static void main(String[] args) {
        Paper p = new Paper();
        p.setColour("White");
        p.setPrice(55);
        p.setQuantity(200);
        p.setType("A4");

        Paper p1 = new Paper();
        p1.setColour("yELLOW");
        p1.setPrice(100);
        p1.setQuantity(250);
        p1.setType("A4");

        Paper p2 = new Paper();
        p2.setColour("White");
        p2.setPrice(60);
        p2.setQuantity(150);
        p2.setType("A4");




        PaperService ps = new PaperService();
        ps.paperSpecification(p);
        ps.paperSpecification(p1);
        ps.paperSpecification(p2);
    }
}
