package com.twu.biblioteca.books;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class BooksStatus {

    Map<Book, Boolean> getAvailableBooks(List<Book> books) {
        Map<Book, Boolean> bookAvailability = new LinkedHashMap<>();
        for (Book book : books) {
            bookAvailability.put(book, true);
        }
        return bookAvailability;
    }
}
