package lab.lab_10;

import java.util.Arrays;
import java.util.List;

public class EmployeeSalaryController {

    public int calculateTotalSalary(List<Empoyee> empList) {
        int totalSalary = 0;
        for (Empoyee empoyee : empList) {
            totalSalary += empoyee.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        List<Empoyee> empList = Arrays.asList(new FullTimeEmployee(),
                new ContractEmployee(),
                new FullTimeEmployee(),
                new ContractEmployee());

        EmployeeSalaryController employeeSalaryController= new EmployeeSalaryController();
        System.out.println("The total salary: " + employeeSalaryController.calculateTotalSalary(empList));
    }
}
