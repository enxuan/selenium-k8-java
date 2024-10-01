package lesson_04;

import java.util.Scanner;

public class SwitchCaseStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz input a number");

        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Giai nhat!");
                break;
            case 2:
                System.out.println("Giai nhi!");
                break;
            case 3:
                System.out.println("Giai ba!");
                break;
            default:
                System.out.println("Chuc ban may man lan sau!!");
        }
    }
}
