package lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopLearning {

    public static void main(String[] args) {

        /*
        * ***** Game Menu ******
        * 1. Generate ramdom number (less than 1000)
        * 0. Exit
         * */
        boolean isContinuing = true;

        while (isContinuing) {
            printSimpleMenu();
            int option = getUserOption();

            if (option == 0) {
                isContinuing = false;
            } else if (option == 1) {
                System.out.println("Your random number: " + new SecureRandom().nextInt(1000));
            } else {
                System.out.println("[ERR] invalid input!!!");
            }
        }

        System.out.println("See u again");
    }

    private static int getUserOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select option: ");
        return scanner.nextInt();
    }

    public static void printSimpleMenu() {
        System.out.println("****** Game Menu *****");
        System.out.println("1. Generate random number (less tha 1000)");
        System.out.println("0. Exit");
    }
}
