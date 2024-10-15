package lesson_13;

import javafx.print.Collation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestDataFactory {

    public static void main(String[] args) {

        //Reading
        String relativeFilePath = "/src/lesson_13/Persons.txt";
        String absoluteFilePath = System.getProperty("user.dir") + relativeFilePath;

        List<Employee> empList = DataFactory.getEmpListFromFile(absoluteFilePath);
        Collections.sort(empList);
        System.out.println(empList);

        // Writing
        Employee teo = new Employee("Teo", 20, 50000);
        Employee ti = new Employee("Ti", 19, 30000);
        Employee tun = new Employee("Tun", 20, 50000);
        List<Employee> empList1 = Arrays.asList(teo, ti, tun);
        String employeeDataFile = System.getProperty("user.dir") + "/src/lesson_13/PersonDB.txt";

        DataFactory.saveEmployeeListToFile(empList1, employeeDataFile);
    }
}
