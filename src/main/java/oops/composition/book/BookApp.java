package oops.composition.book;

public class BookApp {
    public static void main(String[] args) {
        Author author = new Author();
        author.setAuthorName("Pankaj Udas");
        author.setAuthorAddress("Nagpur");
        Author author1 = new Author();
        author1.setAuthorName("" +
                "" +
                "" +
                "" +
                "Sanket Udas");
        author1.setAuthorAddress("Nagpur");


        Publication publisher= new Publication();
        publisher.setCompany("Nirali Publication");
        publisher.setAddress("Nagpur");
        publisher.setSince(1995);


        Book book =new Book();

        book.setTitle("How to crack Exam");
        book.setPublisher(publisher);


        ;


        Author [] authors= new Author[2];
        authors[0]=author;
        authors[1]=author1;
        book.setAuthors(authors);



       Print print1 =new Print();
       print1.bookDetails(book);

    }
}
