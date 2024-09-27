package lab.lab_03;

public class Lab3_2 {

    public static void main(String[] args) {
        int[] intArr = {6, 2, 3, 4, 5, 10, 0};
        int maximumNum, minimumNum;
        maximumNum = minimumNum = intArr[0];

        for (int num : intArr) {
            if (num > maximumNum) {
                maximumNum = num;
            } else if (num < minimumNum) {
                minimumNum = num;
            }
        }

        System.out.println("Minimum: " + minimumNum);
        System.out.println("Maximum: " + maximumNum);
    }
}
