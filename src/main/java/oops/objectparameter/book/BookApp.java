package oops.objectparameter.book;

public class BookApp {
    public static void main(String[] args) {
        Book b= new Book();
        b.setAuthorName("Agrawal.D");
        b.setBookName("UPSC Question Set");
        b.setNoOfPage(200);
        b.setPrice(250);




        BookService bs= new BookService();
         bs.bookBuy(b);

        Book b1= new Book();
        b1.setAuthorName("Agrawal.D");
        b1.setBookName("UPSC Question Set");
        b1.setNoOfPage(200);
        b1.setPrice(350);

         bs.bookSell(b1);
    }
}
