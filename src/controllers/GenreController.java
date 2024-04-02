package controllers;

import models.Genre;
import views.ViewGenre;

import java.util.ArrayList;
import java.util.List;

public class GenreController {
    Genre genre;
    ViewGenre viewGenre;
    //list
    ArrayList<Genre> genres = new ArrayList<>();

    public GenreController() {

    }

    public ArrayList<Genre> list() {
        return genres;
    }

    public void showList() {
        if (genres.size() == 0 ){
            System.out.println("List of genres is empty!");

        } else {
            System.out.println("Show list of genres:");

            for (Genre currentGenre : genres) {
                System.out.println(currentGenre.toString());
            }
        }
    }

    //create
    public void add(Genre genre) {
        genres.add(genre);
    }


    public void create() {

        boolean inputReady = true;
        while (inputReady) {
            Genre genre = new Genre();
            viewGenre = new ViewGenre(genre);
            inputReady = viewGenre.getInputs();
            String name = genre.getName();
            String description = genre.getDescription();

            //add to list of genres
            add(genre);


        }

    }

}

//delete