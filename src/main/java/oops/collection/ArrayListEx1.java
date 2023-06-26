package oops.collection;

import java.util.ArrayList;
public class ArrayListEx1{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object
        System.out.println(list);

        ArrayList list1=new ArrayList();
        list1.add("Apple");
        list1.add(23);
        list1.add(22);
        System.out.println(list1);
        System.out.println(list.get(0));

        Object o= list1.get(0);
        Object o2=list1.get(1);
        System.out.println(o);
        System.out.println(o2);

    }
}
