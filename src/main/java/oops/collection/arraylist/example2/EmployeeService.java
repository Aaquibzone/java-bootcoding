package oops.collection.arraylist.example2;

import java.util.ArrayList;
import java.util.Random;

public class EmployeeService {

    public ArrayList<Employee>  getEmployee(int size) {

        ArrayList<Employee> emps = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Employee emp = buildEmployee();
            emps.add(emp);

        }
        return emps;


    }
    public  Employee buildEmployee(){
     Employee emp =new Employee();
     emp.setName(getRandomNAme());
     emp.setSalary(getRandomSalary());
     emp.setAge(getRandomAge());
     emp.setExperience(getRandomExperience());

     return emp;

         }

         public String getRandomNAme(){

        String[] names = {"Rajesh", "Rima", "Riya", "Danish", "Tendular", "Rinku ", "Tyson", "Maria"};
                int randomIndex=new Random().nextInt(names.length);
        return names[randomIndex];

         }
    private double getRandomSalary() {
        int min = 25000;
        int max = 50000;
        return min + new Random().nextInt(max-min);

    }
    private int  getRandomAge() {
        int min = 25;
        int max = 45;
        return min + new Random().nextInt(max-min);

    }

    private float getRandomExperience() {
        int min = 1;
        int max = 5;
        return min + new Random().nextInt(max-min);

    }


}
