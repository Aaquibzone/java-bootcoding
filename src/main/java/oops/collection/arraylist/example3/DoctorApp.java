package oops.collection.arraylist.example3;

import java.util.ArrayList;

import java.util.ArrayList;

public class DoctorApp {
        public static void main(String[] args) {


            DoctorService d = new DoctorService();
            ArrayList<Doctor> doc = d.getDoctor(10000);

            for (int i = 0; i < doc.size(); i++) {
                System.out.println(i);
                System.out.println("Name: " + doc.get(i).getName());
                System.out.println("Education: " + doc.get(i).getEducation());
                System.out.println("Age: " + doc.get(i).getAge());
                System.out.println("Type Of Doctor: " +doc.get(i).getTypeofdoctor());


            }
        }
}
