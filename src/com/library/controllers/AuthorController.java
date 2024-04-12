package com.library.controllers;

import com.library.models.Author;
import com.library.views.ViewAuthor;

import java.util.ArrayList;
import java.util.List;
public class AuthorController {
    ViewAuthor viewAuthor;
    List<Author> authors = new ArrayList<>();
    public List<Author> list() {
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
    public void add(Author author) {
        authors.add(author);
    }
    public void create() {
        boolean inputReady = true;
        while (inputReady) {
            Author author = new Author();
            viewAuthor = new ViewAuthor(author);
            inputReady = viewAuthor.getInputs();
            add(author);
        }
    }
}
