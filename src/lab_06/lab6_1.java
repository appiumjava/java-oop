package lab_06;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class lab6_1 {
    public static void main(String[] args) {
        String a = "2hrs and 5 minutes";
        String[] spLitStr = a.split(" and ");
        System.out.print("Item of array a: ");
        System.out.println(Arrays.toString(spLitStr));
        String hrsStr = spLitStr[0].replaceAll("[^0-9]", "");
        String minStr = spLitStr[1].replaceAll("[^0-9]", "");
        int hrsNum = Integer.parseInt(hrsStr);
        int minNum = Integer.parseInt(minStr);
        int totalMin = (hrsNum * 60 + minNum);
        System.out.println("Total min of a " + totalMin);
    }
}

