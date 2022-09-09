package lab_02;

import java.util.Scanner;

public class lab2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter height (M): ");
        float height = scanner.nextFloat();
        System.out.printf("Please enter weight (KG): ");
        float weight = scanner.nextFloat();
        float BMI = weight / (height * 2);
        System.out.printf("BMI is %f", BMI);
        if (BMI < 18.5) {
            System.out.printf("\nUnderweight");
            float weightIncrease = (float) (18.5 * (height * 2) - weight);
            System.out.printf("\nUser need increase: " + weightIncrease + " kg to reach normal weight ");
        } else if (BMI <= 24.9) {
            System.out.printf("\nNormal weight");
        } else if (BMI <= 29.9) {
            System.out.printf("\nOverweight");
        } else {
            System.out.printf("\nObesity");
        }
        if (BMI > 24.9) {
            float weightDecrease = (float) (weight - 24.9 * (height * 2));
            System.out.printf("\nUser need decrease: " + weightDecrease + " kg to reach normal weight ");
        }
    }
}
