package com.library.views;

import com.library.models.Author;
import com.library.utils.Validator;

import java.util.Scanner;

public class ViewAuthor {
    String title;

    Author author;
    String name;
    String surname;
    Scanner scanner;
    public ViewAuthor(Author author){this.author = author;}
    public boolean getInputs(){
    scanner = new Scanner(System.in);
    title = " please, write name new author:" ;
        System.out.println(title);
        name = Validator.validateName(scanner);
        author.setName(name);
        title = "Please, write surname new author:";
        System.out.println(title);
        surname = Validator.validateName(scanner);
        author.setSurname(surname);
        title ="If you want add new author - push 'y' ";
        System.out.println(title);
        String answer = scanner.nextLine().trim();
        if (answer.equals("y")) {
            return true;
        }
        return false;
    }
}
