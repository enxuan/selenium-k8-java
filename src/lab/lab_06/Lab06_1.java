package lab.lab_06;

public class Lab06_1 {

    /*
    * Given input string: "2hrs and 5 minutes"
    * Please calculate how many minutes in total
    * */

    public static void main(String[] args) {
        String inputStr = "3hrs and 5 minutes";
        String[] subInputStr = inputStr.split("and");

        int hours = Integer.parseInt(subInputStr[0].replaceAll("[^0-9]", ""));
        int minutes = Integer.parseInt(subInputStr[1].replaceAll("[^0-9]", ""));

        int totalMinutes = hours * 60 + minutes;
        System.out.println("the input string: " + inputStr);
        System.out.println("The minutes in total: " + totalMinutes);
    }
}
