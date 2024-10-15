package lesson_09_1;

import java.util.List;

public class SalaryCalculator {

    // IS-A relationship
    public int getTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary() + employee.getSupportMoney();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Teo") {
            @Override
            public int getSalary() {
                return 0;
            }

            @Override
            public int getSupportMoney() {
                return 0;
            }
        };
    }
}
