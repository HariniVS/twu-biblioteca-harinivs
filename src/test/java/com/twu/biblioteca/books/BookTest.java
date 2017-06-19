package com.twu.biblioteca.books;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldReturnBookName() {
        Book book = new Book("The Alchemist", "Paulo Coelho", 1988);
        assertEquals("The Alchemist", book.getName());
    }

    @Test
    public void shouldReturnAuthorName() {
        Book book = new Book("The Alchemist", "Paulo Coelho", 1988);
        assertEquals("Paulo Coelho", book.getAuthor());
    }

    @Test
    public void shouldReturnPublicationYear() {
        Book book = new Book("The Alchemist", "Paulo Coelho", 1988);
        assertEquals(1988, book.getPublicationYear());
    }

    @Test
    public void shouldReturnABook() {
        Book book = new Book("The Alchemist", "Paulo Coelho", 1988);
        String expectedOutput = String.format("%-50s%-20s%-20s", "The Alchemist", "Paulo Coelho",
                "1988");
        assertEquals(expectedOutput, book.toString());
    }
}
