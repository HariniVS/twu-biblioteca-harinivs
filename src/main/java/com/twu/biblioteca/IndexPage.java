package com.twu.biblioteca;

import com.twu.biblioteca.menu.Action;

import java.util.List;
import java.util.Map;

public class IndexPage {

    private final OutputWriter outputWriter;
    private InputReader inputReader = new InputReader();
    private Map<String, Action> menuItems;
    private Menu mainMenu;
    private BookInventory bookInventory;

    public IndexPage(OutputWriter outputWriter) {
        this.outputWriter = outputWriter;
        mainMenu = new Menu(outputWriter, new InputReader());
        bookInventory = new BookInventory();
    }

    public void displayWelcomeMessage() {
        String welcomeMessage = "Bangalore Public Library Welcomes You !!";
        outputWriter.write(welcomeMessage);
    }

    public List<Book> getAvailableBooks() {
        return bookInventory.getAvailableBooks();
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
        return inputReader.readInput();
    }

    public void performAction(String input) {
        menuItems = mainMenu.getMenuItems();
        Action action = menuItems.getOrDefault(input, new InvalidEntry(outputWriter));
        action.performAction();
    }

    public boolean checkoutBook(String bookName) {
        return bookInventory.checkoutBook(bookName);
    }

    public boolean returnBook(String bookName) {
        return bookInventory.returnBook(bookName);
    }
}
