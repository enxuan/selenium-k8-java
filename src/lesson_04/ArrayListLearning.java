package lesson_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        List<Integer> myArrayList2 = Arrays.asList(1, 2, 3);

        Integer[] arr = new Integer[] {1, 2, 3};
        List<Integer> myArrayList3 = Arrays.asList(arr);
        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(0, 3);

        for (int index = 0; index < myArrayList.size(); index++) {
            System.out.println(myArrayList.get(index));
        }

        for (Integer item : myArrayList) {
            System.out.println(item);
        }
    }
}
