package oops.objectparameter.book;

public class BookService {

    public static void bookBuy(Book b){
        System.out.println(b.getBookName());
        System.out.println(b.getAuthorName());
        System.out.println(b.getNoOfPage());
        System.out.println(b.getPrice());

    }
    public static void bookSell(Book b){
        System.out.println(b.getBookName());
        System.out.println(b.getAuthorName());
        System.out.println(b.getNoOfPage());
        System.out.println(b.getPrice());

    }
}
