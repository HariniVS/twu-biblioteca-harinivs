package com.twu.biblioteca.menu;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.action.*;
import com.twu.biblioteca.user.UserAuthentication;

import java.util.LinkedHashMap;
import java.util.Map;

public class UserMenu extends Menu {

    private Map<String, Action> userMenu;
    private final String BOOK_ITEM = "Book";
    private final String MOVIE_ITEM = "Movie";

    public UserMenu(Repository repository, OutputWriter outputWriter, InputReader inputReader, UserAuthentication userAuthentication) {
        super(repository, outputWriter, inputReader);

        userMenu = new LinkedHashMap<>();
        userMenu.put("1", new ListItems(repository, outputWriter, BOOK_ITEM));
        userMenu.put("2", new ListItems(repository, outputWriter, MOVIE_ITEM));
        userMenu.put("3", new CheckoutItem(repository, outputWriter, BOOK_ITEM, userAuthentication));
        userMenu.put("4", new CheckoutItem(repository, outputWriter, MOVIE_ITEM, userAuthentication));
        userMenu.put("5", new ReturnItem(repository, outputWriter, BOOK_ITEM));
        userMenu.put("6", new ReturnItem(repository, outputWriter, MOVIE_ITEM));
        userMenu.put("7", new UserInformation(outputWriter));
        userMenu.put("8", new Logout(userAuthentication));
        userMenu.put("9", new Quit(outputWriter));
    }

    public void displayMenu() {
        super.displayMenu(userMenu);
    }

    @Override
    public void performAction(String userInput) {
       super.performAction(userInput);
    }
}
