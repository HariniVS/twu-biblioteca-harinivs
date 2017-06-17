package com.twu.biblioteca;

import com.twu.biblioteca.menu.Action;
import com.twu.biblioteca.menu.CheckoutAction;
import com.twu.biblioteca.menu.ListAction;
import com.twu.biblioteca.menu.QuitAction;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private final OutputWriter outputWriter;
    private Map<String, Action> mainMenu = new HashMap<String, Action>();

    Menu(OutputWriter outputWriter, InputReader inputReader) {
        this.outputWriter = outputWriter;
        addOptionsToMenu("1", new ListAction(outputWriter));
        addOptionsToMenu("2", new CheckoutAction(outputWriter, inputReader));
        addOptionsToMenu("3", new QuitAction());
    }

    public void addOptionsToMenu(String option, Action action) {
        mainMenu.put(option, action);
    }

    public Map<String, Action> getMenuItems() {
        return mainMenu;
    }

}
