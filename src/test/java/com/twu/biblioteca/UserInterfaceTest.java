package com.twu.biblioteca;

import com.twu.biblioteca.books.BookInventory;
import com.twu.biblioteca.helpers.UserInterfaceTestHelper;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserInterfaceTest {

    private OutputWriter outputWriter;
    private StringWriter stringWriter;
    private BookInventory bookInventory;
    private UserInterface indexPage;

    @Test
    public void shouldDisplayMenu() {
        stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        bookInventory = new BookInventory();
        indexPage = new UserInterface(outputWriter, bookInventory);

        indexPage.displayMenu();
        final StringBuffer stringBuffer = stringWriter.getBuffer();

        String expectedMenu = "Enter the menu of your choice\n" +
                "1 List Books\n" +
                "2 Checkout Book\n" +
                "3 Return Book\n" +
                "4 Quit\n";
        assertEquals(expectedMenu, stringBuffer.toString());
    }

    @Test
    public void shouldTakeUserInput() {
        String input = "1";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        assertEquals("1", new InputReader().readInput());
    }

    @Test
    public void shouldPerformActionBasedOnUserInput() {
        stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        bookInventory = new BookInventory();
        indexPage = new UserInterface(outputWriter, bookInventory);

        UserInterfaceTestHelper helper = new UserInterfaceTestHelper(outputWriter, bookInventory);
        helper.performAction("1");

        assertTrue(helper.isPerformActionCalled());
    }
}


