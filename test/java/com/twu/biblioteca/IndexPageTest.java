package com.twu.biblioteca;

import com.twu.biblioteca.helpers.IndexPageTestHelper;
import org.junit.Before;
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
    private String expectedOutput;
    private IndexPage indexPage;
    private String expectedMenu;
    private InputReader inputReader;


    @Before
    public void setUp() {
        stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        inputReader = new InputReader();
        indexPage = new IndexPage(outputWriter);
        expectedOutput = "Harry Potter And The Goblet Of Fire \t\t|" +
               "J K Rowling \t\t|" +
               "2008\n" +
                "Harry Potter And The Order Of Phoenix \t\t|" +
               "J K Rowling \t\t|"+ "2012\n";
        expectedMenu = "Enter the menu of your choice\n" +
                "1 List Books\n" +
                "2 Quit\n";
   }

    @Test
    public void shouldAssertTheWelcomeMessage() {
        final String WELCOME_MESSAGE = "Bangalore Public Library Welcomes You";
        assertEquals(WELCOME_MESSAGE, indexPage.getWelcomeMessage());
    }

    @Test
    public void shouldReturnAListOfBooks() {
        assertEquals(getExpectedListOfBooks(), indexPage.getListOfBooks());
    }

    @Test
    public void shouldWriteListOfBooksToOutput(){
        indexPage.displayListOfAvailableBooks();
        final StringBuffer stringBuffer = stringWriter.getBuffer();

        assertEquals(expectedOutput, stringBuffer.toString());
    }

    @Test
    public void shouldDisplayMenu() {
        indexPage.displayMenuToUser();
        final StringBuffer stringBuffer = stringWriter.getBuffer();

        assertEquals(expectedMenu,stringBuffer.toString());
    }

    @Test
    public void shouldTakeUserInput() {
        String input = "1";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        assertEquals("1", inputReader.readInput());
    }

    @Test
    public void shouldPerformActionBasedOnUserInput() {
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


