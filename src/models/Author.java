package models;

import java.util.ArrayList;

public class Author {
    private String surname;
    private String name;
    private ArrayList<Book> books = new ArrayList<>();


    @Override
    public String toString() {

        String booksList = "The list books is empty now.";
        if (books.size() != 0) {
            booksList = "Books: ";

            for (int i = 0; i < books.size(); i++) {
                booksList += books.get(i).getName();

                if (books.size() - 1 != i) {
                    booksList += ", ";
                }
            }
        }

        return "Author: " + getFullName() + ". " + booksList;
    }


    public String getFullName() {
        return surname + " " + name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBook(Book book) {
        this.books.add(book);
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
}
