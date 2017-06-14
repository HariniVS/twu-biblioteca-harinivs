package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BiblotecaTest {

    List<Book> expectedListOfBooks;

    @Test
    public void shouldAssertTheWelcomeMessage() {
        Biblioteca biblioteca = new Biblioteca();
        final String WELCOME_MESSAGE = "Bangalore Public Library Welcomes You";
        assertEquals(WELCOME_MESSAGE, biblioteca.getWELCOME_MESSAGE());
    }

    @Test
    public void shouldReturnAListOfBook() {
        Biblioteca biblioteca = new Biblioteca();
        assertEquals(getExpectedListOfBooks(), biblioteca.getListOfBooks());
    }

    private List<Book> getExpectedListOfBooks() {
        expectedListOfBooks = new ArrayList<Book>();
        expectedListOfBooks.add(new Book("Harry Potter And The Goblet Of Fire", "J K" +
                " Rowling", 2008));
        expectedListOfBooks.add(new Book("Harry Potter And The Order Of Phoenix", "J" +
                " K Rowling", 2012));
        return expectedListOfBooks;
    }
}
