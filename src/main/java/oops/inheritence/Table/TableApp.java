package oops.inheritence.Table;

public class TableApp {
    public static void main(String[] args) {
        DinningTable dt= new DinningTable();
        dt.setLeg(4);
        dt.setColour("Brown");

        TeaTable tt= new TeaTable();
        tt.setLeg(2);
        tt.setColour("White");


        System.out.println(tt.getColour());
        System.out.println(tt.getLeg());
    }
}
