package com.twu.biblioteca.books;

import java.util.LinkedList;
import java.util.List;

class Books {

    private List<Book> books;

    Books() {
        addBooks();
    }

    private void addBooks() {
        books = new LinkedList<>();
        books.add(new Book("The Fountainhead", "Ayn Rand", 1943));
        books.add(new Book("The Alchemist", "Paulo Coelho", 1988));
        books.add(new Book("The Stars Shine Down", "Sidney Sheldon", 1992));
    }


    public List<Book> getBooks() {
        return books;
    }
}
