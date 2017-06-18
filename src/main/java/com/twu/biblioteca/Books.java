package com.twu.biblioteca;

import java.util.LinkedList;
import java.util.List;

class Books {

    private static volatile List<Book> listOfBooksInstance;
    static List<Book> getBooks() {
        if (listOfBooksInstance == null) {
            synchronized (Books.class) {
                if (listOfBooksInstance == null) {
                    listOfBooksInstance = addBooks();
                }
            }
        }
        return listOfBooksInstance;
    }

    private static List<Book> addBooks() {
        listOfBooksInstance = new LinkedList<>();
        listOfBooksInstance.add(new Book("The Alchemist", "Paulo Coelho", 1988));
        listOfBooksInstance.add(new Book("Harry Potter And The Goblet Of Fire",
                "J K Rowling", 2008));
        listOfBooksInstance.add(new Book("Harry Potter And The Order Of Phoenix",
                "J K Rowling", 2012));
        return listOfBooksInstance;
    }
}
