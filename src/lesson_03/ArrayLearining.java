package lesson_03;

public class ArrayLearining {

    public static void main(String[] args) {
        int arrayLength = 5;
        int[] myIntArray = new int[5];

        for (int index = 0; index < arrayLength; index++) {
            myIntArray[index] = index + 1;
        }
//
//        for (int index = 0; index < arrayLength; index++) {
//            System.out.println(myIntArray[index]);
//        }
        for (int arrayElement : myIntArray) {
            System.out.println(arrayElement);
        }
    }
}
