package com.library.views;

import com.library.utils.Validator;

import java.util.Scanner;

public class ViewInterface {
    Scanner scanner;
    int buttonKey;

    public int getInputs() {
        scanner = new Scanner(System.in);
        System.out.println("Select number 1-7: ");
        System.out.println("1: Show list of books. ");
        System.out.println("2: Show list of authors. ");
        System.out.println("3: Show list of genres. ");
        System.out.println("4: Add new books. ");
        System.out.println("5: Add new authors. ");
        System.out.println("6: Add new genres. ");
        System.out.println("7: Remove book. ");
        System.out.println("0: Exit. ");

        buttonKey = Validator.validateIndex(scanner, 7);
        return buttonKey;
    }

}
