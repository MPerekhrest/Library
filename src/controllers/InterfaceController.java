package controllers;

import views.ViewInterface;

import java.util.Scanner;

public class InterfaceController {
    ViewInterface userInterface;
    Scanner scanner;
    String title;
    int number;
    public int run() {
        userInterface = new ViewInterface();
        int button = userInterface.getInputs();
        return button;
    }
}


