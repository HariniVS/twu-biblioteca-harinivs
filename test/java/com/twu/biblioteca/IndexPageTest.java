package com.twu.biblioteca;

import com.twu.biblioteca.helpers.IndexPageTestHelper;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IndexPageTest {

    private List<Book> expectedListOfBooks;
    private OutputWriter outputWriter;
    private StringWriter stringWriter;
    private IndexPage indexPage;

    private String expectedOutput = "Harry Potter And The Goblet Of Fire \t\t|" +
            "J K Rowling \t\t|" +
            "2008\n" +
            "Harry Potter And The Order Of Phoenix \t\t|" +
            "J K Rowling \t\t|"+ "2012\n";
    private String expectedMenu = "Enter the menu of your choice\n" +
                    "1 List Books\n" +
                    "2 Quit\n";


    @Test
    public void shouldAssertTheWelcomeMessage() {
        stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        indexPage = new IndexPage(outputWriter);

        final String WELCOME_MESSAGE = "Bangalore Public Library Welcomes You";
        assertEquals(WELCOME_MESSAGE, indexPage.getWelcomeMessage());
    }

    @Test
    public void shouldReturnAListOfBooks() {
        stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        indexPage = new IndexPage(outputWriter);

        assertEquals(getExpectedListOfBooks(), indexPage.getListOfBooks());
    }

    @Test
    public void shouldWriteListOfBooksToOutput(){
        stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        indexPage = new IndexPage(outputWriter);

        indexPage.displayListOfAvailableBooks();
        final StringBuffer stringBuffer = stringWriter.getBuffer();

        assertEquals(expectedOutput, stringBuffer.toString());
    }

    @Test
    public void shouldDisplayMenu() {
        stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        indexPage = new IndexPage(outputWriter);

        indexPage.displayMenuToUser();
        final StringBuffer stringBuffer = stringWriter.getBuffer();

        assertEquals(expectedMenu,stringBuffer.toString());
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
        indexPage = new IndexPage(outputWriter);

        IndexPageTestHelper helper = new IndexPageTestHelper(outputWriter);
        helper.performAction("1");

        assertTrue(helper.isPerformActionCalled());
    }

    private List<Book> getExpectedListOfBooks() {
        expectedListOfBooks = new ArrayList<Book>();
        expectedListOfBooks.add(new Book("Harry Potter And The Goblet Of " +
                "Fire", "J K Rowling", 2008));
        expectedListOfBooks.add(new Book("Harry Potter And The Order Of Phoenix",
                "J K Rowling", 2012));
        return expectedListOfBooks;
    }

}


