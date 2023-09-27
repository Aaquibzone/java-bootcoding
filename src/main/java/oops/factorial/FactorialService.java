package oops.factorial;

public class FactorialService {
    public int getFact(int num) {
        int fact = 1;

        while (num > 0) {
            fact = fact*num;
            num--;
        }
        return fact;
    }

    public int [] getFacts(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int k = getFact(nums[i]);
            System.out.println(k);
        }
        return nums;
    }

    public void printFacts(int[] numbers,int num) {

        System.out.println(getFacts( numbers));
        System.out.println(getFact(num));
    }
}