package oops.objectparameter.marks;

public class GradeService {

    public static  void grade(Mark m1){

        if(m1.getObtainMark()< m1.getTotalMark()&& m1.getObtainMark()>75){
            System.out.println("MArks Obtained  " + m1.obtainMark);

            System.out.println("A Grade");
        }
        else if  (m1.getObtainMark()< 75 && m1.getObtainMark()>45) {

            System.out.println("B Grade");
        }
        else
        {

            System.out.println("Failed : MArks is below 45");
        }
    }

}
