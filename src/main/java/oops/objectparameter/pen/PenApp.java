package oops.objectparameter.pen;

public class PenApp {
    public static void main(String[] args) {
        Pen p =new Pen();
        p.setPenCompany("Reynolds");
        p.setPenInk("Blue");
        p.setPenType("Ball Pen");
        p.setPrice(10);

        Pen p1 =new Pen();
        p1.setPenCompany("Cello");
        p1.setPenInk("Red");
        p1.setPenType("Gel Pen");
        p1.setPrice(20);

        Pen p2 =new Pen();
        p2.setPenCompany("Camel");
        p2.setPenInk("Black");
        p2.setPenType("Dot Pen");
        p2.setPrice(15);



        PenService ps = new PenService();
        ps.penInformation(p);
        ps.penInformation(p1);
        ps.penInformation(p2);
    }
}
