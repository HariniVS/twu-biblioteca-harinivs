package com.twu.biblioteca;

import java.util.List;

public class Biblioteca {

    private final OutputWriter outputWriter;
    BookInventory bookInventory = new BookInventory();

    private String WELCOME_MESSAGE = "Bangalore Public Library Welcomes You";

    public Biblioteca(OutputWriter outputWriter) {
        this.outputWriter = outputWriter;
    }

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    void displayWelcomeMessage() {
        outputWriter.writeToTheConsole(WELCOME_MESSAGE);
    }

    List<Book> getListOfBooks() {
        return bookInventory.getListOfBooks();
    }

    void displayListOfAvailableBooks() {
        for (Book currentBook : getListOfBooks()) {
            outputWriter.writeToTheConsole(currentBook.toString());
        }
    }
}
