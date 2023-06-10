package oops.objectparameter.marks;

public class MarkApp {

    public static void main(String[] args) {

        Mark m1=new Mark();

        m1.setTotalMark(100);
        m1.setObtainMark(50);

        //Object2
        Mark m2= new Mark();
        m2.setTotalMark(100);
        m2.setObtainMark(40);

        GradeService g1= new GradeService();
        g1.grade(m1);
        g1.grade(m2);

        PercentageService p1= new PercentageService();
        p1.calculatePercentage(m1);
        p1.percentageGrade(m1);
    }
}
