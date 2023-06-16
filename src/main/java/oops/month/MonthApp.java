package oops.month;

public class MonthApp {
    public static void main(String[] args) {
        MonthService obj= new MonthService();
        System.out.println(obj.getMonthsName(1));
        int arr[]={6,4,7};
        obj.printMonths(arr);
    }
}