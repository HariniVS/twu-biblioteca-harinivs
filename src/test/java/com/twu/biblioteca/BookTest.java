package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookTest {

    @Test
    public void shouldReturnBookName() {
        Book book = new Book("The Alchemist", "Paulo Coelho", 1988);
        assertEquals("The Alchemist", book.getName());
    }

    @Test
    public void shouldReturnABook() {
        Book book = new Book("The Alchemist", "Paulo Coelho", 1988);
        assertEquals("The Alchemist \t\t|Paulo Coelho \t\t|1988", book.toString());
    }

    @Test
    public void shouldTestTheAvailabilityOfTheBook() {
        Book book = new Book("The Alchemist", "Paulo Coelho", 1988);
        book.setAvailability(true);
        assertTrue(book.isAvailable());
    }
}
