package lab.lab_06;

import java.util.Scanner;

public class Lab06_2 {

    /* *
    * String myPassword = "password123";
    * Allow user to input maximum 3 times
    *  */

    public static void main(String[] args) {
        String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);

        for (int inputNum = 0; inputNum < 3; inputNum++) {
            System.out.print("Plz input your password: ");
            String inputedPassword = scanner.nextLine();
            if (inputedPassword.equals(myPassword)) {
                System.out.println("Your password is correct!!!");
                break;
            } else {
                System.out.println("Oop, the password is incorrect, plz input again");
            }
        }
    }
}
