package oops.collection.hashmap;

import java.util.ArrayList;
import java.util.Random;

public class StudentMarkService {

    String[] subjects = {"Mathematics-I", "Databse", "Computer Networks",
            "Theory of Computation", "SEM", "Operating System", "AI", "DOS", "DS",
            "SP"};

    private String getRandomSubject(){
        Random random = new Random();
        int randomIndex = random.nextInt(subjects.length);
        return subjects[randomIndex];
    }

    private int getRandomMarks(){
        Random random = new Random();
        return 20 + random.nextInt(80);
    }

    public  void getGrade(){
        if (getRandomMarks()>75){
            System.out.println("Grade A");
        }
        else if (getRandomMarks()<75 && getRandomMarks()<40) {
            System.out.println("Grade B");

        }
    }

}