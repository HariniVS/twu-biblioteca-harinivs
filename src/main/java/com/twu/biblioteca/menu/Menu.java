package com.twu.biblioteca.menu;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.InvalidEntry;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.action.Action;

import java.util.Map;

public abstract class Menu {

    private final OutputWriter outputWriter;
    private Map<String, Action> menu;

    Menu(Repository repository, OutputWriter outputWriter, InputReader inputReader) {
        this.outputWriter = outputWriter;
    }

    public abstract void displayMenu();

     void displayMenu(Map<String, Action> menu) {
        this.menu = menu;
        for (Map.Entry<String, Action> currentMenu : menu.entrySet()) {
            outputWriter.write(currentMenu.getKey() + " " + currentMenu.getValue().toString());
        }
    }

    public void performAction(String input) {
        Action action = menu.getOrDefault(input, new InvalidEntry(outputWriter));
        action.performAction();
    }
}
