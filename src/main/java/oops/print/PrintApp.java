package oops.print;

public class PrintApp {
    public static void main(String[] args) {
        String a[] ={"java","c language","python","ruby","dotnet"};
        PrintService p1=new PrintService();
        p1.print("Programing Languages");
        p1.print(a);
        p1.printTable(5);



    }
}
