package lab.lab_02;

import java.util.Scanner;

public class Lab2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Plz input a number: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 == 0 ) {
            System.out.printf("the input number %d is even number", inputNumber);
        } else {
            System.out.printf("the input number %d is odd number", inputNumber);
        }
    }
}
