package oops.collection.arraylist.example2;
import java.util.ArrayList;

public class EmployeeApp {
        public static void main(String[] args) {


            EmployeeService em = new EmployeeService();
            ArrayList<Employee> emps = em.getEmployee(10000);

            for (int i = 0; i < emps.size(); i++) {
                System.out.println(i);
                System.out.println("Name: " + emps.get(i).getName());
                System.out.println("Salary: " + emps.get(i).getSalary());
                System.out.println("Age: " + emps.get(i).getAge());
                System.out.println("Experience: " + emps.get(i).getExperience());


        }
    }}

