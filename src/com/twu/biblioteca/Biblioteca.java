package com.twu.biblioteca;

import java.util.List;

public class Biblioteca {

    private final OutputWriter outputWriter;
    BookInventory bookInventory = new BookInventory();

    private String WELCOME_MESSAGE = "Bangalore Public Library Welcomes You";

    public Biblioteca(OutputWriter outputWriter) {
        this.outputWriter = outputWriter;
    }

    String getWELCOME_MESSAGE() {
        return WELCOME_MESSAGE;
    }

    List<Book> getListOfBooks() {
        return bookInventory.getListOfBooks();
    }

    void printListOfAvailableBooks() {
        for (Book currentBook : getListOfBooks()) {
            outputWriter.printAvailableBooks(currentBook.toString());
        }
    }

}
