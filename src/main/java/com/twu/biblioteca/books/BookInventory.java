package com.twu.biblioteca.books;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BookInventory {

    private Map<Book, Boolean> bookAvailability = new LinkedHashMap<>();

    private List<Book> getBooks() {
        return Books.getBooks();
    }

    private Map<Book, Boolean> getAvailabilityStatusOfBooks() {
        return BooksStatus.getAvailableBooks(getBooks());
    }

    private Book getBook(String bookName) {
        for (Book book : getBooks()) {
            if (book.getName().equals(bookName)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        bookAvailability = getAvailabilityStatusOfBooks();
        for (Map.Entry<Book, Boolean> book : bookAvailability.entrySet()) {
            if (book.getValue()) {
                availableBooks.add(book.getKey());
            }
        }
        return availableBooks;
    }

    public boolean checkoutBook(String bookName) {
        for (Book book : getAvailableBooks()) {
            if (bookName.equals(book.getName())) {
                bookAvailability.put(book, false);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String bookName) {
        Book book = getBook(bookName);
        bookAvailability = getAvailabilityStatusOfBooks();
        if (bookAvailability.containsKey(book) && (!bookAvailability.get(book))) {
            bookAvailability.put(book, true);
            return true;
        }
        return false;
    }
}
