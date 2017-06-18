package com.twu.biblioteca;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

 class BooksStatus {

    private static volatile Map<Book, Boolean> bookAvailability;

     static Map<Book, Boolean> getAvailableBooks(List<Book> books) {
        if (bookAvailability == null) {
            synchronized (BooksStatus.class) {
                if (bookAvailability == null) {
                    bookAvailability = new LinkedHashMap<>();
                    for (Book book : books) {
                        bookAvailability.put(book, true);
                    }
                }
            }
        }
        return bookAvailability;
    }
}
