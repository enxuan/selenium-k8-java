package lab.lab_03;

public class Lab3_1 {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int evenNumberCount = 0;
        int oddNumberCount = 0;

        for (int number : intArr) {
            if (number % 2 == 0) {
                evenNumberCount++;
            } else {
                oddNumberCount++;
            }
        }

        System.out.println("Even numbers: " + evenNumberCount);
        System.out.println("Odd numbers: " + oddNumberCount);
    }
}
