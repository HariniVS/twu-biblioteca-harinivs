package com.twu.biblioteca;

import java.util.List;

public class Biblioteca {

    BookInventory bookInventory = new BookInventory();

    private String WELCOME_MESSAGE = "Bangalore Public Library Welcomes You";

     String getWELCOME_MESSAGE() {
        return WELCOME_MESSAGE;
    }

     List<Book> getListOfBooks() {
        return bookInventory.getListOfBooks();
    }

    void printListOfAvailableBooks() {

        for (Book currentBook : getListOfBooks()) {
            if (currentBook.isAvailable())
            System.out.println(currentBook);
        }
    }

}
