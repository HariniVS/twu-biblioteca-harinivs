package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    private Menu menu;
    private List<String> expectedMenu;

    @Before
    public void setUp() {
        menu = new Menu();
        expectedMenu = Arrays.asList("1. List Books");
    }

    @Test
    public void shouldReturnMenuItems() {
        menu.addOptionsToMenu(1, "List Books");
        assertEquals(expectedMenu,menu.getMenuItems());
    }

    @Test
    public void shouldAddItemsToMenu() {
        menu.addOptionsToMenu(1, "List Books");
        assertEquals(expectedMenu,menu.getMenuItems());
    }

}
