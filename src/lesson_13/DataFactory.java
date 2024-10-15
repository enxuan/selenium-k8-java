package lesson_13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    public static List<Employee> getEmpListFromFile(String filePath) {
        System.out.println("[INFO] Reading file from" + filePath);
        List<Employee> empList = new ArrayList<>();

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                String[] employeeData = dataLine.split(";");
                String empName = employeeData[0];
                int age = Integer.parseInt(employeeData[1]);
                int salary = Integer.parseInt(employeeData[2]);
                Employee emp = new Employee(empName , age , salary);
                empList.add(emp);

                dataLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return empList;
    }

    public static void saveEmployeeListToFile(List<Employee> empList, String filePath) {
        System.out.println("Writing employee data to File :" + filePath);

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            for (Employee employee : empList) {
                String dataLine = employee.getName() + ";" +
                        employee.getAge() + ";" +
                        employee.getSalary();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
