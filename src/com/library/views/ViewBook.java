package com.library.views;

import com.library.models.Author;
import com.library.models.Book;
import com.library.models.Genre;
import com.library.utils.Validator;

import java.util.List;
import java.util.Scanner;

public class ViewBook {
    String title;
    Book book;
    String name;
    String description;
    int yearOfIssue;
    int authorKey;
    int genreKey;

    List<Author> authors;
    List<Genre> genres;
    List<Book> books;
    Scanner scanner;

    public ViewBook(List<Book> books) {
        this.books = books;
    }

    public ViewBook(Book book, List<Author> authors, List<Genre> genres) {
        this.book = book;
        this.genres = genres;
        this.authors = authors;
    }
    public boolean getInputs() {
        scanner = new Scanner(System.in);

        if (authors.size() != 0) {
            System.out.println("Select from the list authors:");
            for (int i = 0; i < authors.size(); i++) {
                Author currentAuthor = authors.get(i);
                System.out.println((i + 1) + ". " + currentAuthor.getFullName());
            }
            title = " please, select  author from the list :";
            System.out.println(title);
            authorKey = Validator.validateIndex(scanner, authors.size());
            book.setAuthor(authors.get(authorKey - 1));
        } else {
            System.out.println("please, created authors");
            return false;
        }


        if (genres.size() != 0) {
            System.out.println("List of genre:");
            for (int i = 0; i < genres.size(); i++) {
                Genre currentGenre = genres.get(i);
                System.out.println((i + 1) + ". " + currentGenre.getName());
            }

            title = " please, select  genre from the list :";
            System.out.println(title);
            genreKey = Validator.validateIndex(scanner, genres.size());
            book.setGenre(genres.get(genreKey - 1));
        } else {
            System.out.println("Please, created genres");
            return false;
        }
        title = "Please, write name new  book:";
        System.out.println(title);
        name = Validator.validateName(scanner);
        book.setName(name);

        title = "Input description of book: ";
        System.out.println(title);
        description = Validator.validateDescription(scanner);
        book.setDescription(description);

        title = "Input year of issue the book: ";
        System.out.println(title);
        yearOfIssue = Validator.validateYearInput(scanner);
        book.setYear(yearOfIssue);

        return false;
    }

        public Book getBookForDelete() {
        scanner = new Scanner(System.in);
        title = "please select the book  from the list for delete: ";
        System.out.println(title);
        for (int i = 0; i < books.size(); i++) {
            Book booksCurrent = books.get(i);
            System.out.println((i + 1) + " " + booksCurrent.getName());

        }
        Book selectedBook = books.get(Validator.validateIndex(scanner, books.size()) - 1);
        title = " Are you sure you want delete book '" + selectedBook.getName() + "', click 'Y'.";
        System.out.println(title);
        String answer = scanner.next();
        if (!answer.equalsIgnoreCase("Y")){
            return null;
        }
        return selectedBook;

    }

}
