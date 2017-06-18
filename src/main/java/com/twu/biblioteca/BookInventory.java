package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookInventory {

    private List<Book> getListOfBooks() {
        return Books.getInstance();
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : getListOfBooks()) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public boolean checkoutBook(String bookName) {
        for (Book book : getAvailableBooks()) {
            if (bookName.equals(book.getName())) {
                book.setAvailability(false);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String bookName) {
        for (Book book : getListOfBooks()) {
            if (bookName.equals(book.getName()) && !book.isAvailable()) {
                book.setAvailability(true);
                return true;
            }
        }
        return false;
    }
}
