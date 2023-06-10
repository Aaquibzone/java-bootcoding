package oops.objectparameter.marks;

public class PercentageService {
    public static void calculatePercentage(Mark m1){
        System.out.println("Calculate Percentage");
        m1.percent=(m1.getObtainMark()*100)/m1.totalMark;
        System.out.println(m1.percent);


    }
    public  static  void percentageGrade( Mark m1){
        System.out.println("Calculate percentage");


        if(m1.percent< 75){
            System.out.println("Percentage " + m1.percent);

            System.out.println("A Grade");
        }
        else if  (m1.percent<45) {

            System.out.println("B Grade");
        }
        else
        {

            System.out.println("Failed : MArks is below 45");
        }
    }
}
