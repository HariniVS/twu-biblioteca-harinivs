package com.twu.biblioteca;

import com.twu.biblioteca.menu.Action;

import java.util.List;
import java.util.Map;

public class IndexPage {

    private final OutputWriter outputWriter;
    private BookInventory bookInventory = new BookInventory();

    private String WELCOME_MESSAGE = "Bangalore Public Library Welcomes You";
    private InputReader inputReader = new InputReader();
    private Map<String, Action> menuItems;
    private Menu mainMenu;

    public IndexPage(OutputWriter outputWriter) {
        this.outputWriter = outputWriter;
        mainMenu = new Menu(outputWriter, new InputReader());
    }

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public void displayWelcomeMessage() {
        outputWriter.write(WELCOME_MESSAGE);
    }

    public List<Book> getListOfBooks() {
        return bookInventory.getListOfBooks();
    }

    public List<Book> getListOfAvailableBooks() {
        return bookInventory.getListOfAvailableBooks();
    }

    public void displayListOfAvailableBooks() {
        for (Book currentBook : getListOfAvailableBooks()) {
            outputWriter.write(currentBook.toString());
        }
    }

    public void displayMenuToUser() {

        outputWriter.write("Enter the menu of your choice");
        menuItems = mainMenu.getMenuItems();
        for (Map.Entry<String, Action> mapEntry : menuItems.entrySet()) {
            outputWriter.write(String.valueOf(mapEntry.getKey()) + " " + mapEntry
                    .getValue().toString());
        }
    }

    public String getInputFromUser() {
        String userInput = inputReader.readInput();
        return userInput;
    }

    public void performAction(String input) {
        menuItems = mainMenu.getMenuItems();
        if (isValid(input)) {
            Action actionToBePerformed = menuItems.get(input);
            actionToBePerformed.performAction();
        } else {
            outputWriter.write("Select a valid option!");
        }
    }

    public boolean isValid(String input) {
        if (Integer.parseInt(input) > 0 && Integer.parseInt(input) < 5) {
            return true;
        }
        return false;
    }

    public boolean checkoutBook(String bookName) {
        return bookInventory.checkoutBook(bookName);
    }

    public boolean returnBook(String bookName) {
        return bookInventory.returnBook(bookName);
    }
}
