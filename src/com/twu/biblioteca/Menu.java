package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private Map<Integer,String> mainMenu = new HashMap<Integer, String>();

    Menu() {
        mainMenu.put(1, "List Books");
    }

    public void addOptionsToMenu(Integer option, String menu) {
        mainMenu.put(option, menu);
    }

    public Map<Integer, String> getMenuItems() {
        return mainMenu;
    }

}
