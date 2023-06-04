package oops.objectparameter.paper;

public class PaperService {

    public static void paperSpecification(Paper p){
        System.out.println("Page colour:  " + p.getColour());
        System.out.println(" Page Quantity: "+ p.getQuantity());
        System.out.println("Paper Type: " + p.getType());
        System.out.println("Paper Price: " + p.getPrice());


    }
}
