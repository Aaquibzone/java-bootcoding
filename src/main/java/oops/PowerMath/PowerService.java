package oops.PowerMath;

public class PowerService {

    public double powerService(double num){
        double p = Math.pow(num,2);
        return p;
    }
    public double[] multiplePowerServices(double[]nums) {
        double result[] = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = powerService(nums[i]);

        }
        return result;
    }

        public void PrintMethod(double nums []){
            for(int i=0;i< nums.length;i++){
                System.out.print(nums[i] + ",");


        }

    }
}
