package oops.polymorphism.overloading.fitness;

import java.util.Calendar;
import java.util.Date;

public class ExerciseApp {

    public static <Calender> void main(String[] args) {
        HumanExercise he =new HumanExercise();
        he.run();
        he.print();




        he.run(30);
        he.print();


        Calendar c= Calendar.getInstance();
        c.add(Calendar.DAY_OF_YEAR,2);
        Date date=c.getTime();
        he.run(date, 25);
        he.print();



    }
}
