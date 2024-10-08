package lesson_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {
        List<Integer> myArrayList = Arrays.asList(1, 2, 3, 4);
        List<Integer> myArrList2 = new ArrayList<>();
        myArrList2.add(1);
        myArrList2.add(2);
        myArrList2.add(3);
        myArrList2.add(4);
//        for (int i = 0; i < myArrayList.size(); i++) {
//            boolean isElementOddNumber = myArrayList.get(i) %2 != 0;
//            if (isElementOddNumber) {
//                myArrayList.set(i, myArrayList.get(i) + 1);
//            }
//        }
        System.out.println(myArrayList);

        myArrList2.remove(1);
        myArrList2.remove(new Integer(1));
        System.out.println(myArrList2);

        if (!myArrayList.isEmpty()) {
            System.out.println("List's size: " + myArrayList.size());
        }

        // Check element's existance
        System.out.println(myArrayList.contains(5));
        System.out.println(myArrayList.contains(1));

        System.out.println(myArrayList.indexOf(4));

    }
}
