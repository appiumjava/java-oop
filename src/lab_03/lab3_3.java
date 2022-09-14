package lab_03;

import java.util.Arrays;

public class lab3_3 {
    public static void main(String[] args) {
        int[] myIntArr = new int[]{12, 34, 1, 16, 28};
        for (int i = 0; i < myIntArr.length-1; i++) {
            for (int j = i + 1; j < myIntArr.length; j++) {
                if (myIntArr[i] > myIntArr[j]) {
                    int t = myIntArr[i];
                    myIntArr[i] = myIntArr[j];
                    myIntArr[j] = t;
                }
            }
        }
        System.out.print("Array after sort: ");
        for(int value: myIntArr) {
            System.out.print(value + " ");
        }
    }
}
