package lab.lab_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab06_5 {
    /* *
    * Allow user to input a sentence
        Count the words and group them
        Ex: Hello, tui ten teo, ban co phai ten teo khong?
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your string : ");
        String userInputString = scanner.nextLine();
        String userString = userInputString.replaceAll("[^a-zA-Z]", " ");

        Map<String, Integer> wordMap = new HashMap<>();
        String[] userStringArr = userString.split(" ");

        for (String word : userStringArr) {
            if (!word.equals("")) {
                if (wordMap.containsKey(word)) {
                    int count = wordMap.get(word) + 1;
                    wordMap.replace(word, count);
                } else {
                    wordMap.put(word, 1);
                }
            }
        }

        for (String key : wordMap.keySet()) {
            System.out.println(key + " : " + wordMap.get(key));
        }
    }
}
