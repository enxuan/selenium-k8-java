package lesson_12;

import java.io.IOException;

public class CalculatorThrowsInMethod {

    /**
     * @param a first number
     * @exception IOException param can't be zero
     * */
    public int divide(int a, int b){
//        if (b == 0) throw new IllegalArgumentException("Second number can't be null");
        return a / b;
    }

    public static void main(String[] args) {
//        try {
            CalculatorThrowsInMethod calculator = new CalculatorThrowsInMethod();
            System.out.println(calculator.divide(4, 1));
            System.out.println(calculator.divide(4, 0));
//        } catch (Exception e) {
//            throw new IllegalArgumentException("divide by zero");
//        } finally {
//            System.out.println("See u again");
//        }
    }
}
