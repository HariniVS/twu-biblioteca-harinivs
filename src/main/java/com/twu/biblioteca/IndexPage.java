package com.twu.biblioteca;

import java.util.List;
import java.util.Map;

public class IndexPage {

    private final OutputWriter outputWriter;
    private BookInventory bookInventory = new BookInventory();

    private String WELCOME_MESSAGE = "Bangalore Public Library Welcomes You";
    private Menu mainMenu = new Menu();
    private InputReader inputReader = new InputReader();
    private Map<Integer, String> menuItems;

    public IndexPage(OutputWriter outputWriter) {
        this.outputWriter = outputWriter;
    }

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public void displayWelcomeMessage() {
        outputWriter.write(WELCOME_MESSAGE);
    }

    List<Book> getListOfBooks() {
        return bookInventory.getListOfBooks();
    }

    public void displayListOfAvailableBooks() {
        for (Book currentBook : getListOfBooks()) {
            outputWriter.write(currentBook.toString());
        }
    }

    public void displayMenuToUser() {

        outputWriter.write("Enter the menu of your choice");
        menuItems = mainMenu.getMenuItems();
        for (Map.Entry<Integer, String> mapEntry : menuItems.entrySet()) {
            outputWriter.write(String.valueOf(mapEntry.getKey()) + " " + mapEntry
                    .getValue());
        }
    }

    public int getInputFromUser() {
        int userInput = Integer.parseInt(inputReader.readFromConsole());
        return userInput;
    }

    public void performAction(int inputFromUser) {
        switch (inputFromUser) {
            case 1:
                displayListOfAvailableBooks();
                break;
            case 2:
                System.exit(0);
                break;
        }

    }
}
