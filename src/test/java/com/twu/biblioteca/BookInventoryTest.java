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
        ArrayList<Book> expectedListOfBooks = new ArrayList<Book>();
        expectedListOfBooks.add(new Book("The Alchemist", "Paulo Coelho", 1988));
        expectedListOfBooks.add(new Book("Harry Potter And The Goblet Of Fire", "J K Rowling",
                2008));
        expectedListOfBooks.add(new Book("Harry Potter And The Order Of Phoenix", "J K Rowling",
                2012));
        return expectedListOfBooks;
    }
}
