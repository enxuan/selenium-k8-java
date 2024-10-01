package lab.lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleMenuOptions {

    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        // Generate list with 10 random number that less than 1000
        for (int i = 0; i < 10; i++) {
            myArrayList.add(new SecureRandom().nextInt(1000));
        }

        boolean isContinue = true;

        while (isContinue) {
            showOptionsMenu();
            int option = getOption();

            switch (option) {
                case 1:
                    printAllNumbers(myArrayList);
                    break;
                case 2:
                    printMaximumValue(myArrayList, true);
                    break;
                case 3:
                    printMaximumValue(myArrayList, false);
                    break;
                case 4:
                    System.out.print("Plz input the number you want to search: ");
                    Scanner scanner = new Scanner(System.in);
                    int searchNumber =  scanner.nextInt();
                    searchNumberIndex(myArrayList, searchNumber);
                    break;
                default:
                    System.out.println("BYE BYE");
                    isContinue = false;
            }
        }
    }

    private static void searchNumberIndex(List<Integer> myArrayList, int searchNumber) {
        System.out.print("The search number index: ");
        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i) == searchNumber) {
                System.out.print(" " + i);
            }
        }
    }

    public static void printMaximumValue(List<Integer> arrayList, boolean isMaxValue) {
        int max = arrayList.get(0);
        int min = arrayList.get(0);
        for (Integer num : arrayList) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        if (isMaxValue) {
            System.out.println("The maximum value: " + max);
        } else {
            System.out.println("The minimum value: " + min);
        }
    }

    public static void printAllNumbers(List<Integer> arrayList) {
        System.out.println("The array value: ");
        for (Integer number : arrayList) {
            System.out.print("   " + number);
        }
    }

    public static int getOption() {
        System.out.print("Plz input your option: ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void showOptionsMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Print all numbers");
        System.out.println("2. print maximum value");
        System.out.println("3. print minimum value");
        System.out.println("4. search number");
    }
}
