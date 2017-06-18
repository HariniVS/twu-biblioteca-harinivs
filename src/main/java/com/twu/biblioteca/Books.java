package com.twu.biblioteca;

import java.util.LinkedList;
import java.util.List;

public class Books {

    private static volatile List<Book> listOfBooksInstance;

    public static List<Book> getInstance() {
        if (listOfBooksInstance == null) {
            synchronized (Books.class) {
                if (listOfBooksInstance == null) {
                    listOfBooksInstance = addBooks();
                }
            }
        }
        return listOfBooksInstance;
    }

    public static List<Book> addBooks() {
        listOfBooksInstance = new LinkedList<>();
        listOfBooksInstance.add(new Book("The Alchemist", "Paulo Coelho", 1988, true));
        listOfBooksInstance.add(new Book("Harry Potter And The Goblet Of Fire",
                "J K Rowling", 2008, true));
        listOfBooksInstance.add(new Book("Harry Potter And The Order Of Phoenix",
                "J K Rowling", 2012, true));
        return listOfBooksInstance;
    }
}