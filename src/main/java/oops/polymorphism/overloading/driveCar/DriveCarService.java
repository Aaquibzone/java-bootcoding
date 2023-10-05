package oops.polymorphism.overloading.driveCar;

public class DriveCarService {
    //Drive Car (with distance, with number of members, quantity of stop)
    double distance;
    int member;
     int stop;
    public void driveCar()
    {
        distance=253;
        member=2;
        stop=4;

    }
    public void print(){
        System.out.println("Distance Covered " + distance + " with No of Member: " + member+ " No of Stops " + stop);


    }
}
