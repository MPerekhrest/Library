package com.library.controllers;

import com.library.views.ViewInterface;

public class InterfaceController {
    ViewInterface userInterface;
    public int run() {
        userInterface = new ViewInterface();
        int button = userInterface.getInputs();
        return button;
    }
}


