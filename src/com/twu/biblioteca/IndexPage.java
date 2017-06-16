package com.twu.biblioteca;

import java.util.List;
import java.util.Map;

public class IndexPage {

    private final OutputWriter outputWriter;
    private BookInventory bookInventory = new BookInventory();

    private String WELCOME_MESSAGE = "Bangalore Public Library Welcomes You";
    private Menu mainMenu = new Menu();

    public IndexPage(OutputWriter outputWriter) {
        this.outputWriter = outputWriter;
    }

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    void displayWelcomeMessage() {
        outputWriter.write(WELCOME_MESSAGE);
    }

    List<Book> getListOfBooks() {
        return bookInventory.getListOfBooks();
    }

    void displayListOfAvailableBooks() {
        for (Book currentBook : getListOfBooks()) {
            outputWriter.write(currentBook.toString());
        }
    }

    void displayMenuToUser() {

    final Map<Integer, String> menuItems = mainMenu.getMenuItems();
        for (Map.Entry<Integer, String> mapEntry : menuItems.entrySet()) {
            outputWriter.write(String.valueOf(mapEntry.getKey())+" "+mapEntry
                    .getValue());
        }
    }
}