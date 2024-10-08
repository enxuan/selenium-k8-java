package lesson_05;

import java.util.Arrays;

public class StringLearning {

    public static void main(String[] args) {
//        String myName1 = "Teo";  // Literal declaration
//        String myName2 = "Teo";  // Literal declaration
//        String myName3 = new String("Teo"); // Via String object
//
//        System.out.println("myName1 == myName2 : " + myName1.equals(myName2));
//        System.out.println("myName1 == myName3 : " + myName1.equals(myName3));
//
//        // Check lower case, uppercase, digit, ...
//        String myPassword = "123myPassword";
//        char[] myCharacters = myPassword.toCharArray();
//        int totalLowerCase = 0;
//        int totalDigit = 0;
//        int totalUpperCase = 0;
//        for (char character : myCharacters) {
//            if (Character.isDigit(character)) totalDigit++;
//            else if (Character.isUpperCase(character)) totalUpperCase++;
//            else if (Character.isLowerCase(character)) {
//                totalLowerCase++;
//            }
//        }
//
//        if (totalDigit > 0 && totalLowerCase > 0 && totalUpperCase > 0) {
//            System.out.println("you are all set!");
//        } else {
//            System.out.println("Password format is wrong");
//        }
//
//        // Replacement | Immutable
//        String badWordContainer = " bad, very bad, sth else, bad ";
//        System.out.println(badWordContainer.replace("bad", "***"));
//        System.out.println(badWordContainer);
//
//        // Trim
//        System.out.println(badWordContainer.trim());
//        System.out.println(badWordContainer);

        // Substring, indexOf, split
        String url = " https://google.com";
        System.out.println(url.indexOf("w"));
        System.out.println(url.indexOf("h"));
        System.out.println(url.indexOf("https_"));
        System.out.println(url.length());

        System.out.println(url.substring(0, 3));
        System.out.println(url.substring(2));

        // Split
        String[] splitStr = url.split("://");
        System.out.println(Arrays.toString(splitStr));

        // Regex | Regular Expression
        String myCookingTimes = "   105 mins   ";
        // TODO: Pattern and Matcher
        String cookingTimeNumStr = myCookingTimes.replaceAll("[^0-9]", "");
        System.out.println(cookingTimeNumStr);
        int cookingTime = Integer.valueOf(cookingTimeNumStr);

        System.out.println("cooking time is : " + (cookingTime + 1));

        // Concatenation
        String s1 = "Hello, ";
        String s2 = "Teo";
        System.out.println(s1.concat(s2));
        System.out.println(s1 + s2);

        // StringBuilder
    }
}
