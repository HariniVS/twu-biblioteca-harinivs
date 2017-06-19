package com.twu.biblioteca.books;

import java.util.LinkedList;
import java.util.List;

class Books {

    private List<Book> listOfBooksInstance;

    Books() {
        addBooks();
    }

    private void addBooks() {
        listOfBooksInstance = new LinkedList<>();
        listOfBooksInstance.add(new Book("The Fountainhead", "Ayn Rand", 1943));
        listOfBooksInstance.add(new Book("The Alchemist", "Paulo Coelho", 1988));
        listOfBooksInstance.add(new Book("The Stars Shine Down", "Sidney Sheldon", 1992));
    }


    public List<Book> getBooks() {
        return listOfBooksInstance;
    }
}
