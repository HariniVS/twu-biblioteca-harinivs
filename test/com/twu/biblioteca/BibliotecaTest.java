package com.twu.biblioteca;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    private List<Book> expectedListOfBooks;
    final StringWriter bufferedWriter = new StringWriter();
    private OutputWriter outputWriter = new OutputWriter(bufferedWriter);
    String expectedOutput = "Book name = Harry Potter And The Goblet Of Fire," +
            " " +
            "Author = J K " +
            "Rowling, Year of publication = 2008\n"+"Book name = Harry Potter" +
            " And The " +
            "Order Of Phoenix, " +
            "Author = J K Rowling, Year of publication = 2012\n";

    @Test
    public void shouldAssertTheWelcomeMessage() {
        Biblioteca biblioteca = new Biblioteca(outputWriter);
        final String WELCOME_MESSAGE = "Bangalore Public Library Welcomes You";
        assertEquals(WELCOME_MESSAGE, biblioteca.getWELCOME_MESSAGE());
    }

    @Test
    public void shouldReturnAListOfBook() {
        OutputWriter outputWriter = new OutputWriter(new BufferedWriter(new StringWriter()));
        Biblioteca biblioteca = new Biblioteca(outputWriter);
        assertEquals(getExpectedListOfBooks(), biblioteca.getListOfBooks());
    }

    @Test
    public void shouldWriteListOfBooksToOutput(){
        Biblioteca biblioteca = new Biblioteca(outputWriter);
        biblioteca.printListOfAvailableBooks();
        final OutputWriter outputWriter = new OutputWriter(bufferedWriter);
        assertEquals(expectedOutput,
                bufferedWriter.getBuffer().toString());
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


