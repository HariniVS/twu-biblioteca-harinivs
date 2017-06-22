package com.twu.biblioteca.menu;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.action.Action;
import com.twu.biblioteca.action.ListItems;
import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibrarianMenuTest {

    private StringWriter writer;
    private Repository repository;
    private InputReader inputReader;
    private OutputWriter outputWriter;

    @Before
    public void setUp() {
        writer = new StringWriter();
        outputWriter = new OutputWriter(writer);
        inputReader = new InputReader();
        repository = new Repository();
    }

    @Test
    public void shouldDisplayMenu() {
        LibrarianMenu menu = new LibrarianMenu(repository, outputWriter, inputReader);
        menu.displayMenu();

        String expectedMenu =
                "1 List CheckedOut Book\n" +
                "2 List CheckedOut Movie\n" +
                "3 Logout\n" +
                "4 Quit\n";

        assertEquals(expectedMenu, writer.getBuffer().toString());
    }

    @Test
    public void shouldCallPerformAction() {
        LibrarianMenuTestHelper menu = new LibrarianMenuTestHelper(repository, outputWriter, inputReader);
        Map<String, Action> menuMap = new LinkedHashMap<>();
        menuMap.put("4", new Logout());
        menu.displayMenu(menuMap);
        menu.performAction("4");

        assertTrue(menu.isActionPerformed());
    }
}
