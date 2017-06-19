package com.twu.biblioteca.books;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookInventory {

    private final Books books = new Books();
    private Map<Book, Boolean> bookAvailability;
    private final BooksStatus booksStatus = new BooksStatus();

    private List<Book> bookList;

    public BookInventory() {
        bookList = getBookList();
        bookAvailability = getBookAvailability();
    }

    private List<Book> getBookList() {
        return books.getBooks();
    }

    private Map<Book, Boolean> getBookAvailability() {
        return booksStatus.getAvailableBooks(bookList);
    }

    private Book getBook(String bookName) {
        for (Book book : bookList) {
            if (book.getName().equals(bookName)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Map.Entry<Book, Boolean> book : bookAvailability.entrySet()) {
            if (book.getValue()) {
                availableBooks.add(book.getKey());
            }
        }
        return availableBooks;
    }

    public boolean checkoutBook(String bookName) {
        for (Book book : bookList) {
            if (bookName.equals(book.getName())) {
                bookAvailability.put(book, false);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String bookName) {
        Book book = getBook(bookName);
        if (bookAvailability.containsKey(book) && (!bookAvailability.get(book))) {
            bookAvailability.put(book, true);
            return true;
        }
        return false;
    }
}
