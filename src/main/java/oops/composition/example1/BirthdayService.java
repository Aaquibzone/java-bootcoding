package oops.composition.example1;

import javax.xml.namespace.QName;

public class BirthdayService {

    private Birthday name;

    private Birthday age;


    public void birthdayCard( String name, int age ) {

        System.out.println( "Birthday of : "+ name + " age is: " + age);

    }


}
