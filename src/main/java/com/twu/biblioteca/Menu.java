package com.twu.biblioteca;

import com.twu.biblioteca.menu.*;

import java.util.HashMap;
import java.util.Map;

class Menu {

    private Map<String, Action> mainMenu = new HashMap<>();

    Menu(OutputWriter outputWriter, InputReader inputReader) {
        addOptionsToMenu("1", new ListAction(outputWriter));
        addOptionsToMenu("2", new CheckoutAction(outputWriter, inputReader));
        addOptionsToMenu("3", new ReturnAction(outputWriter, inputReader));
        addOptionsToMenu("4", new QuitAction(outputWriter));
    }

    void addOptionsToMenu(String option, Action action) {
        mainMenu.put(option, action);
    }

    Map<String, Action> getMenuItems() {
        return mainMenu;
    }

}
