package oops.composition.book;

public class Print {

    public void bookDetails(Book book){


        System.out.println(book.getPublisher().getCompany());
        System.out.println(book.getPublisher().getSince());
        System.out.println(book.getPublisher().getAddress());

        Author[] authors= book.getAuthors();
        for (int i=0; i<authors.length;i++){
            System.out.println(authors[i].getAuthorName());
        }




        System.out.println(book.getTitle());

    }

}
