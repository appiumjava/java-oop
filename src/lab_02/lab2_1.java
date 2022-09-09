package lab_02;

import java.util.Scanner;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter height: ");
        float height = scanner.nextFloat();
        System.out.printf("Please enter weight: ");
        float weight = scanner.nextFloat();
        float BMI = weight / (height * 2);
        System.out.printf("BMI is %f", BMI);
        if (BMI <= 18.4) {
            System.out.printf("\nUnderweight");
        } else if (BMI <= 24.9) {
            System.out.printf("\nNormal weight");
        } else if (BMI <= 29.9) {
            System.out.printf("\nOverweigh");
        } else {
            System.out.printf("\nObesity");
        }
    }
}
