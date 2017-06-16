package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IndexPageTest {

    private List<Book> expectedListOfBooks;
    private OutputWriter outputWriter;
    private StringWriter stringWriter;
    private String expectedOutput;
    private IndexPage indexPage;
    private String expectedMenu;


    @Before
    public void setUp() {
        stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        indexPage = new IndexPage(outputWriter);
        expectedOutput = "Book name = Harry Potter And The Goblet Of Fire," +
               " " +
               "Author = J K " +
               "Rowling, Year of publication = 2008\n" + "Book name = Harry Potter" +
               " And The " +
               "Order Of Phoenix, " +
               "Author = J K Rowling, Year of publication = 2012\n";
   }

    @Test
    public void shouldAssertTheWelcomeMessage() {
        IndexPage indexPage = new IndexPage(outputWriter);
        final String WELCOME_MESSAGE = "Bangalore Public Library Welcomes You";
        assertEquals(WELCOME_MESSAGE, indexPage.getWelcomeMessage());
    }

    @Test
    public void shouldReturnAListOfBooks() {
        IndexPage indexPage = new IndexPage(outputWriter);
        assertEquals(getExpectedListOfBooks(), indexPage.getListOfBooks());
    }

    @Test
    public void shouldWriteListOfBooksToOutput(){
        IndexPage indexPage = new IndexPage(outputWriter);
        indexPage.displayListOfAvailableBooks();
        final StringBuffer stringBuffer = stringWriter.getBuffer();
        assertEquals(expectedOutput, stringBuffer.toString());
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


