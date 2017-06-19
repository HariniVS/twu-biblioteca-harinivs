package com.twu.biblioteca.books;

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
        listOfBooksInstance.add(new Book("The Fountainhead", "Ayn Rand", 1943));
        listOfBooksInstance.add(new Book("The Alchemist", "Paulo Coelho", 1988));
        listOfBooksInstance.add(new Book("The Stars Shine Down", "Sidney Sheldon", 1992));
        return listOfBooksInstance;
    }
}
