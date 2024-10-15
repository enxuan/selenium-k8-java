package lesson_12;

public class Calculator {
    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            calculator.divide(4, 0);
        } catch (Exception e) {
            throw new IllegalArgumentException("divide by zero");
        } finally {
            System.out.println("See u again");
        }
    }
}
