package lab.lab_02;

import java.util.Scanner;

public class Lab2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****** The program to calculate BMI *******");

        System.out.print("Plz input your height in meter: ");
        float height = scanner.nextFloat();

        System.out.print("Plz input your weight in Kg: ");
        float weight = scanner.nextFloat();

        float BMI = weight / (height * 2);
        System.out.println("Your BMI is: " + BMI);

        if (BMI < 18.5) {
            System.out.println("You are under weight, plz find way to increase your weight");
        } else if (BMI <= 24.9) {
            System.out.println("You has normal weight, Congratulation!!!");
        } else if (BMI <= 29.9) {
            System.out.println("You are over weight, you should lose your weight.");
        } else {
            System.out.println("You are in Obesity status, you should find way to lose your weight ASAP");
        }
    }
}
