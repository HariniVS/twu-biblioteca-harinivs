package com.twu.biblioteca;

import com.twu.biblioteca.menu.Action;
import com.twu.biblioteca.menu.ListAction;
import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    private Menu menu;
    private String expectedMenu;
    private StringWriter stringWriter;
    private OutputWriter outputWriter;

    @Before
    public void setUp() {
        stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        menu = new Menu(outputWriter);
        expectedMenu = "List Books";
    }

    @Test
    public void shouldReturnMenuItems() {
        menu.addOptionsToMenu("1", new ListAction(outputWriter));
        final Map<String, Action> menuItems = menu.getMenuItems();
        final Action action = menuItems.get(1);
        assertEquals(expectedMenu, action.toString());
    }

    @Test
    public void shouldAddItemsToMenu() {
        menu.addOptionsToMenu("1", new ListAction(outputWriter));
        final Map<String, Action> menuItems = menu.getMenuItems();
        final Action action = menuItems.get(1);
        assertEquals(expectedMenu, action.toString());
    }

}
