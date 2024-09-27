package lab.lab_03;

public class Lab3_4 {

    public static void main(String[] args) {
        int[] arr1 = {1, 12, 16, 28, 34, 100};
        int[] arr2 = {1, 13, 16, 27, 99};
        int[] mergedSortedArr = new int[arr1.length + arr2.length];

        int idx1 = 0, idx2 = 0, mergeIdx = 0;
        while (idx1 < arr1.length) {
            if (idx2 == arr2.length) break;
            while (idx2 < arr2.length) {
                if (idx1 == arr1.length) break;
                if (arr1[idx1] < arr2[idx2]) {
                    mergedSortedArr[mergeIdx++] = arr1[idx1++];

                } else {
                    mergedSortedArr[mergeIdx++] = arr2[idx2++];
                }
            }
        }

        while (idx1 < arr1.length) {
            mergedSortedArr[mergeIdx++] = arr1[idx1++];
        }

        while (idx2 < arr2.length) {
            mergedSortedArr[mergeIdx++] = arr2[idx2++];
        }

        System.out.println("The sorted merged array: ");
        for (int i : mergedSortedArr) {
            System.out.print(i + " ");
        }
    }
}
