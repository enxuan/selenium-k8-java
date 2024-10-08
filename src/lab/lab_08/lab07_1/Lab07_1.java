package lab.lab_08.lab07_1;

import java.util.ArrayList;
import java.util.List;

public class Lab07_1 {

    /* *
    * Create a class Employee with a method salary to return employee’s salary
        There are 2 types of employee: Full time employee and contract employee
        Full time employee has salary is 50000 and contract employee has salary 40000
        Write a method to accept a list of Employee and calculate total salary
        For example, company has 3 FTE and 2 contractor
    * */
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Employee ti = new FullTimeEmployee();
        Employee teo = new ContractEmployee();
        Employee a = new FullTimeEmployee();
        int totalSalary = 0;

        empList.add(ti);
        empList.add(teo);
        empList.add(a);

        for (Employee employee : empList) {
            totalSalary += employee.getSalary();
        }

        System.out.println("The total salary: " + totalSalary);
    }
}
