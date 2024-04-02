package controllers;

import models.Author;
import views.ViewAuthor;

import java.util.ArrayList;

public class AuthorController {
    Author author;

    ViewAuthor viewAuthor;
    // list
    ArrayList<Author> authors = new ArrayList<>();

    public AuthorController() {

    }

    public ArrayList<Author> list() {
        return authors;
    }

    public void showList() {
        if (authors.size() == 0) {
            System.out.println("List of authors is empty!");
        } else {
            System.out.println("Show list of authors:");
            for (Author currentAuthor : authors) {
                System.out.println(currentAuthor.toString());
            }
        }
    }


    //create
    public void add(Author author) {
        authors.add(author);
    }

    public void create() {
        boolean inputReady = true;
        while (inputReady) {
            Author author = new Author();
            viewAuthor = new ViewAuthor(author);
            inputReady = viewAuthor.getInputs();
            // add to list authors
            add(author);
        }
    }
}
