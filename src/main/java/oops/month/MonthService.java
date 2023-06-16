package oops.month;

public class MonthService {


    String arr[]={"JANUARY", " FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE","JULY","AUGUST",
            "SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    public String getMonthsName(int num)
    {
        if(num > 12){
            System.err.println("Value should in a range of 1-12!");
            return "";
        }
        return arr[num - 1];
    }
    public String[] printMonths(int arr[])
    {
        String result[]=new String[arr.length];
        for(int i=0;i< arr.length;i++)
        {
            result[i] = getMonthsName(arr[i]);
            System.out.println(result[i]);
        }
        return result;
    }
}




