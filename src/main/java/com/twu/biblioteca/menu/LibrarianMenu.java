package com.twu.biblioteca.menu;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.action.Action;
import com.twu.biblioteca.action.ListCheckedOutItems;
import com.twu.biblioteca.action.Quit;

import java.util.LinkedHashMap;
import java.util.Map;

public class LibrarianMenu extends Menu {

    private final String BOOK_ITEM = "Book";
    private final String MOVIE_ITEM = "Movie";
    private final Map<String, Action> librarianMenu;

    public LibrarianMenu(Repository repository, OutputWriter outputWriter, InputReader inputReader) {
        super(repository, outputWriter, inputReader);
        librarianMenu = new LinkedHashMap<>();

        librarianMenu.put("1", new ListCheckedOutItems(repository, outputWriter, BOOK_ITEM));
        librarianMenu.put("2", new ListCheckedOutItems(repository, outputWriter, MOVIE_ITEM));
        librarianMenu.put("3", new Logout());
        librarianMenu.put("4", new Quit(outputWriter));
    }

    public void displayMenu() {
        super.displayMenu(librarianMenu);
    }

    @Override
    public void performAction(String input) {
        super.performAction(input);
    }
}
