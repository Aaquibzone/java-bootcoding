package oops.cube;

import oops.armstrong.ArmstrongServices;

public class CubeApp {
    public static void main(String[] args) {
        CubeServices c1 =new CubeServices();
        System.out.println(c1.findCube(5));

        int []arr={2,5,8};

        int[] res= c1.multipleNumber(arr);

        ArmstrongServices a1= new ArmstrongServices();
        a1.printArray(res);

    }
}
