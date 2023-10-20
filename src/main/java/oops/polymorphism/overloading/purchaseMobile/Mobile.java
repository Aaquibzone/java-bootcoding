package oops.polymorphism.overloading.purchaseMobile;

import oops.composition.book.Book;

public class Mobile {
    String companyName;
    int quantity;
    boolean cover;


    public void purchase(){
        companyName="Samsung";
        quantity=10;


    }
    public void purchase (String CompanyName,int quantity){
        this.companyName= CompanyName;
        this.quantity=quantity;



        }
    public void print(){
        System.out.println("Company Name is " + companyName + " Quantity Required : " + quantity );


    }
    public String purchase(String companyName,int quantity,Boolean cover)
    {
        this.companyName=companyName;
        this.quantity=quantity;
        if(cover)
        {
            System.out.println("need backCover ");
            return "yes" ;
        }
        else
            return "No";
    }


}
