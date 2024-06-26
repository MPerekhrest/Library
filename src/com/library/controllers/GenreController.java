package com.library.controllers;

import com.library.models.Genre;
import com.library.views.ViewGenre;
import java.util.ArrayList;
import java.util.List;

public class GenreController {
    ViewGenre viewGenre;
    List<Genre> genres = new ArrayList<>();
    public List<Genre> list() {
        return genres;
    }
    public void showList() {
        if (genres.size() == 0) {
            System.out.println("List of genres is empty!");

        } else {
            System.out.println("Show list of genres:");

            for (Genre currentGenre : genres) {
                System.out.println(currentGenre.toString());
            }
        }
    }
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
            add(genre);
        }
    }
}

