package com.library.models;
public class Book {
    private String name;
    private String description;
    private int year;
    private Genre genre;
    public Author author;
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book: " + name +
                "  Year: " + year +
                "  Genre: " + genre.getName() +
                "  Author: " + author.getFullName();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
