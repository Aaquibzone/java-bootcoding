package oops.typeCasting.pen;

public class MainApp {
    public static void main(String[] args) {
        Pen p = new Marker();
        p.display();
        Marker wm= new Marker();

        p=wm;
        WhiteMarker wm1= (WhiteMarker) p;
        wm1.print();



    }
}
