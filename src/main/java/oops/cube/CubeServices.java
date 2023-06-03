package oops.cube;

public class CubeServices {
    public int findCube(int num){
        int cube;
        cube=num*num*num;
        return cube;
    }

    public int[]  multipleNumber(int [] arr){
        int result[]= new int [arr.length];
        for(int i =0; i< arr.length;i++){
            result[i]= findCube(arr[i]);

        }
        return result;
    }
}
