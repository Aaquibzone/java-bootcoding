package oops.objectparameter.objectArray;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        StudentApp sa = new StudentApp();
        Student[] studentArr = new Student[0];
        sa.printStudents(studentArr);

        // int arr[]=new int[5]; normal array declare
        Scanner scanner = new Scanner(System.in);
        studentArr = new Student[2];

        for (int i = 0; i < studentArr.length; i++) {
            System.out.println("Enter Value For " + i + "index Student");
            System.out.println("ENter roll number");
            studentArr[i].rollNumber = Integer.parseInt(scanner.nextLine());

            System.out.println("ENter NAme");
            studentArr[i].name = scanner.nextLine();

            System.out.println("ENter Percentage");
            studentArr[i].percentage = Double.parseDouble(scanner.nextLine());
        }


    }
    public  void printStudents(Student [] arr){
        for(int i=0;i< arr.length;i++){
            System.out.println("Enter Value For " + arr[i].rollNumber );
            System.out.println("ENter roll number");

            System.out.println("ENter NAme");


            System.out.println("ENter Percentage");

        }

    }
}
