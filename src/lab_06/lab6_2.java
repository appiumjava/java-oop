package lab_06;

import java.util.Scanner;

public class lab6_2 {
    public static void main(String[] args) {
        boolean isContinuing = true;
        String passWord = "password123";
        int count = 0;
        while (isContinuing) {
            System.out.print("Pls enter password: ");
            Scanner scanner = new Scanner(System.in);
            String pwInput = scanner.next();
            if (pwInput.equals(passWord)) {
                System.out.print("Correct Password!");
                isContinuing = false;
            } else {
                count++;
                System.out.println("Incorrect Password!");
            }
            if (count == 3) {
                System.out.print("Entered wrong password 3 times!");
                isContinuing = false;
            }
        }
    }
}

