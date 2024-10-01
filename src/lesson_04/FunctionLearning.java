package lesson_04;

import java.security.SecureRandom;

public class FunctionLearning {

    public static void main(String[] args) {
        sayHello("Teo"); //"teo" is argument
        sayHello("Ti");

        System.out.println(getARandomNumber(2));
        System.out.println(getARandomNumber(10));
        printNumber();
    }

    //name: parameter
    public static void  sayHello(String name) {
        System.out.println("Hi, " + name);
    }

    public static int getARandomNumber(int boundary) {
        return new SecureRandom().nextInt(boundary);
    }

    public static void printNumber() {
        for (int index = 0; index < 10; index++) {
            if (index == 8) {
                System.out.println("You have reach the magic number");
                return;
            }
            else System.out.println(index);
        }
    }
}
