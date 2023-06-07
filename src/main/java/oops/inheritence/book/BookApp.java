package oops.inheritence.book;

public class BookApp {
    public static void main(String[] args) {

        Book  b = new Book();
        System.out.println("Book Properties");
        //System.out.println("Title : " + (b.title="One Peice"));
        System.out.println("Price : " + (b.price=400));
        System.out.println("Publication Date : " + (b.publicationDate="27june1999"));
        System.out.println("Pages :" + (b.pages=200));

        AudioBook audio = new AudioBook();
        System.out.println("Audio Book Inherited Properties");
       // System.out.println("Title : " + (audio.title="Sherlock Holmes"));
        System.out.println("Price : " + (audio.price=499));
        System.out.println("Publication Date : " + (audio.publicationDate="5june2010"));
        System.out.println("Type: " + (audio.type="Audio Book"));


        Ebook eb = new Ebook();
        System.out.println("Audio Book Inherited Properties");
        //System.out.println("Title : " + (eb.title="Sherlock Holmes"));
        System.out.println("Price : " + (eb.price=299));
        System.out.println("Publication Date : " + (eb.publicationDate="5April1995"));
        System.out.println("Type: " + (eb.type="E Book"));
        System.out.println("Pages :" + (eb.pages=200));

        TextBook tb = new TextBook();
        System.out.println("Audio Book Inherited Properties");
       // System.out.println("Title : " + (tb.title="Baal Bharti "));
        System.out.println("Price : " + (tb.price=299));
        System.out.println("Publication Date : " + (tb.publicationDate="8-November-2002"));
        System.out.println("Type: " + (tb.type="Text Book"));
        System.out.println("Pages :" + (tb.pages=200));








    }

}
