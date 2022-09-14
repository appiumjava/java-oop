package lab_03;

import java.util.Scanner;

public class lab3_1_2 {
    public static void main(String[] args) {
        int oddCount = 0;
        int evenCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter array length: ");
        int size = scanner.nextInt();
        int[] myIntArr = new int[size];
        System.out.printf("Enter element of array: ");
        for (int i = 0; i < size; i++) {
            myIntArr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (myIntArr[i]%2==0){
                evenCount++;
            }else oddCount++;
        }
        System.out.println("Total even number: "+ evenCount);
        System.out.println("Total odd number: "+ oddCount);
    }
}

