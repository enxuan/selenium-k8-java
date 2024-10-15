package lesson_10_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSalary {

    public static void main(String[] args) {
        Employee teo = new Employee("Teo", 10);
        teo.setAge(20);
        Employee ti = new Employee("Ti", 10);
        ti.setAge(19);
        Employee tun = new Employee("Tun", 7);
        tun.setAge(21);

        List<Employee> employees = Arrays.asList(teo, ti, tun);
        System.out.println("***** BEFORE *****");
        System.out.println(employees);

        Collections.sort(employees);
        System.out.println("***** AFTER *****");
        System.out.println(employees);

        employees.sort(new EmpAgeComparator());
        System.out.println("***** SORT AGE *****");
        System.out.println(employees);
    }
}
