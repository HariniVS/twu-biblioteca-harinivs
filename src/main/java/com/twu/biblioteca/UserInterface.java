package com.twu.biblioteca;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.books.BookInventory;
import com.twu.biblioteca.menu.Action;
import com.twu.biblioteca.menu.Menu;

import java.util.List;
import java.util.Map;

public class UserInterface {

    private final OutputWriter outputWriter;
    private final BookInventory bookInventory;
    private InputReader inputReader = new InputReader();
    private Map<String, Action> menuItems;
    private Menu mainMenu;

    public UserInterface(OutputWriter outputWriter, BookInventory bookInventory) {
        this.outputWriter = outputWriter;
        this.bookInventory = bookInventory;
        mainMenu = new Menu();
    }

    public void displayWelcomeMessage() {
        String welcomeMessage = "Bangalore Public Library Welcomes You !!";
        outputWriter.write(welcomeMessage);
    }

    public List<Book> getAvailableBooks() {
        return bookInventory.getAvailableBooks();
    }

    public void displayMenu() {
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

    public void write(String output) {
        outputWriter.write(output);
    }

    public void performAction(String input) {
        menuItems = mainMenu.getMenuItems();
        Action action = menuItems.getOrDefault(input, new InvalidEntry(outputWriter));
        action.performAction(new UserInterface(outputWriter, bookInventory));
    }

    public boolean checkoutBook(String bookName) {
        return bookInventory.checkoutBook(bookName);
    }

    public boolean returnBook(String bookName) {
        return bookInventory.returnBook(bookName);
    }
}