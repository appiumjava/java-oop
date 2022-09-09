package lab_02;

import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter number: ");
        int number = scanner.nextInt();
        if (number <= 0){
            System.out.printf("Invalid number");
        }else if (number%2 == 0) {
            System.out.printf(number + " is even number!");
        }else {
            System.out.printf(number + " is odd number!");
        }
    }
}
