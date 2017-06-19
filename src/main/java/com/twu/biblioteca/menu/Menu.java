package com.twu.biblioteca.menu;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private Map<String, Action> mainMenu = new HashMap<>();

    public Menu() {
        addOptionsToMenu("1", new ListAction());
        addOptionsToMenu("2", new CheckoutAction());
        addOptionsToMenu("3", new ReturnAction());
        addOptionsToMenu("4", new QuitAction());
    }

    public void addOptionsToMenu(String option, Action action) {
        mainMenu.put(option, action);
    }

    public Map<String, Action> getMenuItems() {
        return mainMenu;
    }

}
