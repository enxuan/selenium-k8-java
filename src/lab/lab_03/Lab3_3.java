package lab.lab_03;

public class Lab3_3 {

    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    int tmp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = tmp;
                }
            }
        }

        System.out.println("the increasing sorted array:");
        for (int i : intArr) {
            System.out.print(i + " ");
        }
    }
}
