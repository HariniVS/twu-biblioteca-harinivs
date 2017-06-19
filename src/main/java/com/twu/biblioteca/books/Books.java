package com.twu.biblioteca.books;

import java.util.LinkedHashMap;
import java.util.Map;

class Books {

    private Map<Book, Boolean> books;

    Books() {
        addBooks();
    }

    private void addBooks() {
        books = new LinkedHashMap<>();
        books.put(new Book("The Fountainhead", "Ayn Rand", 1943), true);
        books.put(new Book("The Alchemist", "Paulo Coelho", 1988), true);
        books.put(new Book("The Stars Shine Down", "Sidney Sheldon", 1992), true);
    }


    public Map<Book, Boolean> getBooks() {
        return books;
    }
}
