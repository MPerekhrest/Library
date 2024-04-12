package com.library.controllers;
import com.library.views.MainInterface;
public class MainController {
    MainInterface userInterface;
    public int run() {
        userInterface = new MainInterface();
        int button = userInterface.getInputs();
        return button;
    }
}


