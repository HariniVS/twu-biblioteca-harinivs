package com.twu.biblioteca;

import com.twu.biblioteca.menu.LibrarianMenu;
import com.twu.biblioteca.menu.MainMenu;
import com.twu.biblioteca.menu.Menu;
import com.twu.biblioteca.menu.UserMenu;

import java.util.LinkedHashMap;
import java.util.Map;

public class UserInterface {

    private final OutputWriter outputWriter;
    private Map<String, Menu> menuMap;
    private InputReader inputReader = new InputReader();

    public UserInterface(OutputWriter outputWriter, InputReader inputReader, Repository repository) {
        this.outputWriter = outputWriter;
        this.inputReader = inputReader;

        menuMap = new LinkedHashMap<>();
        menuMap.put("General", new MainMenu(repository, outputWriter, inputReader));
        menuMap.put("Customer", new UserMenu(repository, outputWriter, inputReader));
        menuMap.put("Librarian", new LibrarianMenu(repository, outputWriter, inputReader));
    }

    public void displayWelcomeMessage() {
        String welcomeMessage = "Bangalore Public Library Welcomes You !!";
        outputWriter.write(welcomeMessage);
    }

    public String getInputFromUser() {
        return inputReader.readInput();
    }

    public void write(String output) {
        outputWriter.write(output);
    }

    public void performAction(String input, String userType) {
        final Menu menu = this.menuMap.get(userType);
        menu.performAction(input);
    }

    public void displayMenu(String userType) {
        final Menu menu = this.menuMap.get(userType);
        menu.displayMenu();
    }

}
