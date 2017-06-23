package com.twu.biblioteca;

import com.twu.biblioteca.menu.Menu;
import com.twu.biblioteca.user.UserAuthentication;

public class UserInterface {

    private final OutputWriter outputWriter;
    private InputReader inputReader = new InputReader();
    private MenuCreator menuCreator;
    private Menu menu;

    public UserInterface(OutputWriter outputWriter, InputReader inputReader, Repository repository, UserAuthentication userAuthentication) {
        this.outputWriter = outputWriter;
        this.inputReader = inputReader;
        menuCreator = new MenuCreator(outputWriter, inputReader, repository, userAuthentication);
    }

    public void displayWelcomeMessage() {
        String welcomeMessage = "Bangalore Public Library Welcomes You !!";
        outputWriter.write(welcomeMessage);
    }

    public String getInputFromUser() {
        return inputReader.readInput();
    }

    public void performAction(String input) {
        menu.performAction(input);
    }

    public void displayMenu() {
        menu = menuCreator.getMenu();
        menu.displayMenu();
    }

}
