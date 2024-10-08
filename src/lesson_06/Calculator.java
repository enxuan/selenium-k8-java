package lesson_06;

public class Calculator {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Varagrs | Rest Parameters
    public int sum(int... restNumber) {
        int arrTotal = 0;
        for (int number : restNumber) {
            arrTotal += number;
        }
        return arrTotal;
    }

    // When overloading happen | compile Time
    // When overriding happen | Run Time
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.sum(1, 2, 3));
        System.out.println(calculator.sum(1, 2, 3, 4, 5, 6));
    }
}
