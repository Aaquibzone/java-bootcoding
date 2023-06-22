package oops.typeCasting;

public class MainApp {
    public static void main(String[] args) {
        Pen p = new Marker();
        p.display();
        Marker wm= new Marker();

        p=wm;


    }
}
