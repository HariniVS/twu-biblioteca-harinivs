package com.twu.biblioteca.books;

import com.twu.biblioteca.InvalidEntry;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.menu.Action;
import com.twu.biblioteca.menu.ListAction;
import com.twu.biblioteca.menu.Menu;
import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    private Menu menu;
    private String expectedMenu;
    private OutputWriter outputWriter;

    @Before
    public void setUp() {
        StringWriter stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        menu = new Menu();
        expectedMenu = "List Books";
    }

    @Test
    public void shouldReturnMenuItems() {
        menu.addOptionsToMenu("1", new ListAction());
        final Map<String, Action> menuItems = menu.getMenuItems();
        final Action action = menuItems.get("1");
        assertEquals(expectedMenu, action.toString());
    }

    @Test
    public void shouldAddItemsToMenu() {
        menu.addOptionsToMenu("1", new ListAction());
        final Map<String, Action> menuItems = menu.getMenuItems();
        final Action action = menuItems.get("1");
        assertEquals(expectedMenu, action.toString());
    }

    @Test
    public void ShouldHandleInvalidMenu() {
        final Map<String, Action> menuItems = menu.getMenuItems();
        final Action action = menuItems.getOrDefault("7", new InvalidEntry(outputWriter));
        String expectedMenu = "Select a valid option!";

        assertEquals(expectedMenu, action.toString());
    }
}
