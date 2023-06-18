package oops.armstrong;

public class ArmstrongServices {

    public boolean getArmstrong(int n){
        int r=0;
        int temp=n;
        int sum=0;

        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
         return  temp==sum;

        }



    public int[] getMultipleNumber(int arr[]){
    int [] result= new int[arr.length];
     for (int i=0; i < arr.length;i++){
         if(getArmstrong(arr[i])) {
             result[i] = arr[i];
         }

     }
    return result;
    }
    public  void printArray(int []nums){
        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i] + ",");

        }
    }
}

