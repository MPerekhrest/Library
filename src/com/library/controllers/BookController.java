package com.library.controllers;

import com.library.models.Author;
import com.library.models.Book;
import com.library.models.Genre;
import com.library.views.ViewBook;
import java.util.ArrayList;
import java.util.List;
public class BookController {
    ViewBook viewBook;
    List<Genre> genres;
    List<Author> authors;
    List<Book> books = new ArrayList<>();
    public BookController(List<Author> authors, List<Genre> genres) {
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
        if (book != null) {
            book.author.getBooks().remove(book);
            books.remove(book);
        }
    }
}


