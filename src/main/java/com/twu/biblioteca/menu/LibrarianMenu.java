package com.twu.biblioteca.menu;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.InvalidEntry;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;

import java.util.LinkedHashMap;
import java.util.Map;

public class LibrarianMenu implements MenuProvider{

    private final String BOOK_ITEM = "Book";
    private final String MOVIE_ITEM = "Movie";

    private final Map<String, Action> librarianMenu;
    private OutputWriter outputWriter;

    public LibrarianMenu(Repository repository, OutputWriter outputWriter, InputReader inputReader) {
        this.outputWriter = outputWriter;

        librarianMenu = new LinkedHashMap<>();

        librarianMenu.put("1", new ListCheckedOutItems(repository, outputWriter, BOOK_ITEM));
        librarianMenu.put("2", new ListCheckedOutItems(repository, outputWriter, MOVIE_ITEM));
        librarianMenu.put("3", new Logout());
        librarianMenu.put("4", new QuitAction(outputWriter));
    }

    @Override
    public void displayMenu() {
        outputWriter.write("Enter the menu of your choice");
        for (Map.Entry<String , Action> menu : librarianMenu.entrySet()) {
            outputWriter.write(menu.getKey() + " " + menu.getValue().toString());
        }
    }

    @Override
    public void performAction(String userInput) {
        Action action = librarianMenu.getOrDefault(userInput, new InvalidEntry(outputWriter));
        action.performAction();
    }
}
