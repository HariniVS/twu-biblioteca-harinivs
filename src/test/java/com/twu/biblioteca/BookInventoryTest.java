package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookInventoryTest {

    @Test
    public void shouldReturnAvailableBook() {
        BookInventory bookInventory = new BookInventory();
        assertEquals(getExpectedListOfBooks(), bookInventory.getAvailableBooks());
    }

    private List<Book> getExpectedListOfBooks() {
        ArrayList<Book> expectedListOfBooks = new ArrayList<>();
        expectedListOfBooks.add(new Book("The Fountainhead", "Ayn Rand", 1943));
        expectedListOfBooks.add(new Book("The Alchemist", "Paulo Coelho", 1988));
        expectedListOfBooks.add(new Book("The Stars Shine Down", "Sidney Sheldon", 1992));
        return expectedListOfBooks;
    }
}
