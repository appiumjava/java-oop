package lab_06;

import java.util.Arrays;

public class lab6_3 {
    public static void main(String[] args) {
        String myStr = "100 minutes";
        String result = "";
        char[] strArr = myStr.toCharArray();
        for (char character : strArr) {
            if (Character.isDigit(character)) {
                result = result + character;
            }
        }
        System.out.println("Result is: "+ result);
    }
}

