package lab.lab_06;

public class Lab06_3 {

    /* *
    * String myStr = "100 minutes";
        NOT using REGEX, extract digit character from that String
        Expected output: "100".
        EX: "12345nabc678" -> "12345678"
    * */

    public static void main(String[] args) {
        String myStr = "100 minutes";
        char[] strCharArr = myStr.toCharArray();
        String numberStr = "";

        for (char letter : strCharArr) {
            if (Character.isDigit(letter)) {
                numberStr += letter;
            }
        }
        System.out.printf("Number in the string : \"%s\" is: %s", myStr, numberStr);
    }
}
