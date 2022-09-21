package lab_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        boolean isContinuing = true;
        while (isContinuing) {
            printMenu();
            int userOption = getUserOption();
            switch (userOption) {
                case 1:
                    addNumList(numberList);
                    break;
                case 2:
                    printNumbers(numberList);
                    break;
                case 3:
                    findMax(numberList);
                    break;
                case 4:
                    findMin(numberList);
                    break;
                case 5:
                    searchNum(numberList);
                    break;
                case 0:
                    isContinuing = false;
                    System.out.println("See you again!");
                    break;
                default:
                    System.out.println("Please re-enter the number from 0 to 5");
            }
        }
    }

    public static void printMenu() {
        System.out.println("\n=====MENU======");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");
        System.out.println("0. Exit");
    }

    public static int getUserOption() {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void addNumList(List<Integer> numberList) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter list length: ");
        int size = scanner.nextInt();
        if (size == 0) {
            System.out.println("List is empty!");
        } else {
            System.out.printf("Enter element of list: ");
            for (int i = 0; i < size; i++) {
                numberList.add(scanner.nextInt());
            }
        }
    }

    public static void checkEmpty(List<Integer> numberList) {
        if (numberList.isEmpty()) {
            System.out.println("List is empty, Please enter list! ");
            addNumList(numberList);
        }
    }

    public static void printNumbers(List<Integer> numberList) {
        checkEmpty(numberList);
        System.out.print("All numbers of list: ");
        for (Integer value : numberList) {
            System.out.print(value + " ");
        }
    }

    public static void findMax(List<Integer> numberList) {
        checkEmpty(numberList);
        int max = numberList.get(0);
        for (int i = 0; i < numberList.size(); i++) {
            if (max < numberList.get(i)) {
                max = numberList.get(i);
            }
        }
        System.out.print("Max number is " + max);
    }

    public static void findMin(List<Integer> numberList) {
        checkEmpty(numberList);
        int min = numberList.get(0);
        for (int i = 0; i < numberList.size(); i++) {
            if (min > numberList.get(i)) {
                min = numberList.get(i);
            }
        }
        System.out.print("Max number is " + min);
    }

    public static void searchNum(List<Integer> numberList) {
        checkEmpty(numberList);
        List<Integer> iList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int num = scanner.nextInt();
        for (int i = 0; i < numberList.size(); i++) {
            if (num == numberList.get(i)) {
                iList.add(i);
            }
        }
        if (iList.isEmpty()) {
            System.out.println("List does not contain number " + num);
        } else {
            System.out.print("Position of number " + num + " is: ");
            for (Integer value : iList) {
                System.out.print(value + " ");
            }
        }
    }
}




