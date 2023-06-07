package oops.inheritence.book;

public class Book {
    private String title;
    public double price;

    public int pages;

    public String publicationDate;

    public String type;

    public   void privateVariable(){
        System.out.println("Private Variable Using in same class through Method ");
        title="Main Book";
        System.out.println(title);

    }



    protected void buyBook(){
        System.out.println("__________Buying Book Method(Protected)_________");
        sellBook();


    }

    private void  sellBook(){
        System.out.println("--- Book Method(private)--");


    }
}
