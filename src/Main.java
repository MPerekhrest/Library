import controllers.AuthorController;
import controllers.BookController;
import controllers.GenreController;
import controllers.InterfaceController;
import models.Author;
import models.Genre;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GenreController genreController = new GenreController();
        AuthorController authorController = new AuthorController();
        ArrayList<Genre> genres = genreController.list();
        ArrayList<Author> authors = authorController.list();
        BookController bookController = new BookController(authors, genres);

        boolean inputReady = true;
        while (inputReady) {
            InterfaceController interfaceController = new InterfaceController();
            int select = interfaceController.run();

            switch (select) {
                case 1 -> bookController.showList();
                case 2 -> authorController.showList();
                case 3 -> genreController.showList();
                case 4 -> bookController.create();
                case 5 -> authorController.create();
                case 6 -> genreController.create();
                case 7 -> bookController.delete();
            }

            if (select == 0) {
                inputReady = false;
            }
        }
        //        GenreController genreController = new GenreController();
//        genreController.create();
//
//        AuthorController authorController = new AuthorController();
//        authorController.create();
//
//        ArrayList<Genre> genres = genreController.list();
//        ArrayList<Author> authors = authorController.list();
//
//        BookController bookController = new BookController(authors, genres);
//        bookController.create();
//        bookController.list();
//
//        authorController.list();
//    }
//}
    }
}