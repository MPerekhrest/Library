package controllers;

import models.Author;
import models.Book;
import models.Genre;
import views.ViewBook;

import java.util.ArrayList;
import java.util.Scanner;

public class BookController {
    Book book;

    ViewBook viewBook;

    ArrayList<Genre> genres;
    ArrayList<Author> authors;
    ArrayList<Book> books = new ArrayList<>();


    public BookController(ArrayList<Author> authors, ArrayList<Genre> genres) {
        this.authors = authors;
        this.genres = genres;
    }

    public void showList() {
        if (books.size() == 0) {
            System.out.println("List of books is empty!");
        } else {
            System.out.println("Show list of books:");
            for (Book currentBook : books) {
                System.out.println(currentBook.toString());
            }
        }
    }

    public ArrayList<Book> list() {
        return books;
    }

    public void add(Book book) {
        books.add(book);
    }

    public void create() {
        boolean inputReady = true;
        while (inputReady) {
            Book book = new Book();
            viewBook = new ViewBook(book, authors, genres);
            inputReady = viewBook.getInputs();
            if (book.getName() != null) {
                add(book);
                addBookToAuthor(book);
            }
        }
    }

    public void addBookToAuthor(Book book) {
        Author author = book.author;
        author.setBook(book);
    }

    public void delete() {
        viewBook = new ViewBook(books);

        Book book = viewBook.getBookForDelete();
        if(book != null){
            book.author.getBooks().remove(book);
            books.remove(book);
        }
    }
}


