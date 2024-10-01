package lesson_04;

public class ArrayPostfixPrefix {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = ++a + b;
        int[] myIntArray = new int[5];
        for (int i = 0; i < 5; i++) {
            myIntArray[i] = i + 1;
        }

        for (int i : myIntArray) {
            System.out.println(i);
        }
    }

}
