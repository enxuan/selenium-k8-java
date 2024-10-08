package lesson_05;

import java.util.*;

public class RemovingDuplicatedValues {

    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(7);
        myArrList.add(1);
        myArrList.add(5);
        myArrList.add(2);
        myArrList.add(3);

        /*
        * get 3 smallest values
        *
        * */

        List<Integer> withoutDuplicatedValuesList = new ArrayList<>();
        for (Integer number : myArrList) {
            if (!withoutDuplicatedValuesList.contains(number)) {
                withoutDuplicatedValuesList.add(number);
            }
        }

        System.out.println(myArrList);
        System.out.println(withoutDuplicatedValuesList);

        // Set
//        Set<Integer> set = new HashSet<>(myArrList);
//        myArrList = new ArrayList<>(set);
//        System.out.println(myArrList);

        Collections.sort(withoutDuplicatedValuesList);
        System.out.println(withoutDuplicatedValuesList);

        // Sublist
        List<Integer> firstThreddValues = withoutDuplicatedValuesList.subList(0, 3);
        System.out.println(firstThreddValues);
    }
}
