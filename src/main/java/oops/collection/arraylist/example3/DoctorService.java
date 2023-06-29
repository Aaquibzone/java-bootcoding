package oops.collection.arraylist.example3;

import oops.collection.arraylist.example2.Employee;

import java.util.ArrayList;
import java.util.Random;

public class DoctorService {


        public ArrayList<Doctor> getDoctor(int size) {

            ArrayList<Doctor> doc = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Doctor dt = buildDoctor();
                doc.add(dt);

            }
            return doc;


        }
        public  Doctor buildDoctor(){
            Doctor doc =new Doctor();
            doc.setName(getRandomNAme());
           doc.setEducation(getRandomEducation());
           doc.setAge(getRandomAge());
           doc.setTypeofdoctor(getRandomType());

            return doc;

        }

        public String getRandomNAme(){

            String[] names = {"Rajesh", "Rima", "Riya", "Danish", "Tendular", "Rinku ", "Tyson", "Maria"};
            int randomIndex=new Random().nextInt(names.length);
            return names[randomIndex];

        }
        private String getRandomEducation() {
            String[] names = {"MBBS", "BAMS","Dental", "Physiotherapy","Paediatrics"};
            int randomIndex=new Random().nextInt(names.length);
            return names[randomIndex];

        }
        private int  getRandomAge() {
            int min = 26;
            int max = 45;
            return min + new Random().nextInt(max-min);

        }

    private String getRandomType() {
        String[] names = {"General practitioner", "Emergency Physician"};
        int randomIndex=new Random().nextInt(names.length);
        return names[randomIndex];

    }


    }


