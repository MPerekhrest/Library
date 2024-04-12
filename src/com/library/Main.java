package com.library;

import com.library.controllers.AuthorController;
import com.library.controllers.BookController;
import com.library.controllers.GenreController;
import com.library.controllers.MainController;
import com.library.models.Author;
import com.library.models.Genre;

import java.util.List;

public class Main {
    public static void main(String[] args) {



        GenreController genreController = new GenreController();
        AuthorController authorController = new AuthorController();
        List<Genre> genres = genreController.list();
        List<Author> authors = authorController.list();
        BookController bookController = new BookController(authors, genres);


        boolean inputReady = true;
        while (inputReady) {
            MainController interfaceController = new MainController();
            int select = interfaceController.run();

            switch (select) {
                case 1 -> bookController.showList();
                case 2 -> authorController.showList();
                case 3 -> genreController.showList();
                case 4 -> bookController.create();
                case 5 -> authorController.create();
                case 6 -> genreController.create();
                case 7 -> bookController.delete();
                default -> inputReady = false;
            }

            if (select == 0) {
                inputReady = false;
            }
        }
    }
}