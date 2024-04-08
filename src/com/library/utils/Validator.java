package com.library.utils;

import java.util.Scanner;

public class Validator {
    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine();
        while (str.isEmpty()) {
            System.out.println("Empty! Enter name genre: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }
    public static String validateDescription(Scanner scanner) {
        String str = scanner.nextLine();
        while (str.isEmpty()) {
            System.out.println("Empty! Enter description of genre: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    public static int validateIndex(Scanner scanner, int size) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();

            System.out.printf("\"%s\" - not number!\n", str);
            System.out.println("Enter number!: ");
        }
        int index = scanner.nextInt();
        while (index < 0 || index > size) {
            System.out.println("Value wrong! Enter index : ");
            while (!scanner.hasNextLine()) {
                String str = scanner.next().trim();
                int number = Integer.parseInt(str);
                System.out.printf("\"%s\" - not number!\n", number);
                System.out.println("Enter number!: ");
            }
            index = scanner.nextInt();
        }
        return index;
    }

    public static int validateYearInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - not number!\n", str);
            System.out.println("Enter year of issue!: ");
        }
        int year = scanner.nextInt();
        while (year <= 0) {
            System.out.println("Value wrong! Enter year of issue!: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - not number!\n", str);
                System.out.println("Enter year of issue!: ");
            }
            year = scanner.nextInt();
        }
        return year;
    }

}
