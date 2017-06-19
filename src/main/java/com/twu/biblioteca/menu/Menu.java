package com.twu.biblioteca.menu;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private Map<String, Action> mainMenu = new HashMap<>();

    public Menu(OutputWriter outputWriter, InputReader inputReader) {
        addOptionsToMenu("1", new ListAction(outputWriter));
        addOptionsToMenu("2", new CheckoutAction(outputWriter, inputReader));
        addOptionsToMenu("3", new ReturnAction(outputWriter, inputReader));
        addOptionsToMenu("4", new QuitAction(outputWriter));
    }

    public void addOptionsToMenu(String option, Action action) {
        mainMenu.put(option, action);
    }

    public Map<String, Action> getMenuItems() {
        return mainMenu;
    }

}
