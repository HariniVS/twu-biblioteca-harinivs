package com.twu.biblioteca;

import com.twu.biblioteca.menu.Action;
import com.twu.biblioteca.menu.*;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private final OutputWriter outputWriter;
    private Map<String,Action> mainMenu = new HashMap<String, Action>();

    Menu(OutputWriter outputWriter) {
        this.outputWriter = outputWriter;
        addOptionsToMenu("1", new ListAction(outputWriter));
        addOptionsToMenu("2", new QuitAction());
    }

    public void addOptionsToMenu(String option, Action action) {
        mainMenu.put(option, action);
    }

    public Map<String, Action> getMenuItems() {
        return mainMenu;
    }

}
