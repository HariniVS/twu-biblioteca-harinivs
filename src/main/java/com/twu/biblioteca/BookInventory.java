package com.twu.biblioteca;

import java.util.LinkedList;
import java.util.List;

public class BookInventory {

    private List<Book> listOfBooks = new LinkedList<Book>();

    public BookInventory() {
        addBooks();
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    private List<Book> addBooks() {
        listOfBooks.add(new Book("The Alchemist", "Paulo Coelho", 1988, true));
        listOfBooks.add(new Book("Harry Potter And The Goblet Of Fire",
                "J K Rowling", 2008, true));
        listOfBooks.add(new Book("Harry Potter And The Order Of Phoenix",
                "J K Rowling", 2012, true));
        return listOfBooks;
    }
}
