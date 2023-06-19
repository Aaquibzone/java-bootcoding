package oops.polymorphism.overloading.fitness;

import java.util.Date;

public class HumanExercise {
    private Date date;
    private int time;


    public void run(){

        date =new Date();
        time =15;

    }
    public void run (int time){
        date = new Date();
        this.time=time;

    }


//    public void run(int mon, double f, float d){
//
//    }
//    public void run(float mon, double f, int d){
//
//    }

    public void run(Date date, int t) {

        date = new Date();
        this.time=time;
    }
public void print(){
        System.out.println("Running for " + time + "mins at" + date);


    }



}
