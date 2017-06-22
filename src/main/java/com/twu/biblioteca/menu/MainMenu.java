package com.twu.biblioteca.menu;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.action.Action;
import com.twu.biblioteca.action.ListItems;
import com.twu.biblioteca.action.Quit;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainMenu extends Menu{

    private Map<String, Action> mainMenu;
    private final String BOOK_ITEM = "Book";
    private final String MOVIE_ITEM = "Movie";

    public MainMenu(Repository repository, OutputWriter outputWriter, InputReader inputReader) {
        super(repository, outputWriter, inputReader);

        mainMenu = new LinkedHashMap<>();
        mainMenu.put("1", new ListItems(repository, outputWriter, BOOK_ITEM));
        mainMenu.put("2", new ListItems(repository, outputWriter, MOVIE_ITEM));
        mainMenu.put("3", new Login(outputWriter, inputReader));
        mainMenu.put("4", new Quit(outputWriter));
    }

    public void displayMenu() {
        super.displayMenu(mainMenu);
    }

    @Override
    public void performAction(String input) {
        super.performAction(input);
    }
}
