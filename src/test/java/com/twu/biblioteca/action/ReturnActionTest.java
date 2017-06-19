package com.twu.biblioteca.action;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.IndexPage;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.books.BookInventory;
import com.twu.biblioteca.menu.ReturnAction;
import com.twu.biblioteca.helpers.InputReaderTestHelper;
import com.twu.biblioteca.menu.CheckoutAction;
import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReturnActionTest {

    private OutputWriter outputWriter;
    private InputReaderTestHelper inputReader;
    private IndexPage indexPage;
    private BookInventory bookInventory;

    @Before
    public void setUp() {
        StringWriter stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        inputReader = new InputReaderTestHelper("The Alchemist\nThe Alchemist");
        bookInventory = new BookInventory();
        indexPage = new IndexPage(outputWriter, bookInventory);
    }

    @Test
    public void shouldReturnOption() {
        ReturnAction returnAction = new ReturnAction(outputWriter, inputReader);
        assertEquals("Return Book", returnAction.toString());
    }

    @Test
    public void shouldDisplayAReturnedBook() {
        CheckoutAction checkoutAction = new CheckoutAction(outputWriter, inputReader);
        checkoutAction.performAction(new IndexPage(outputWriter, bookInventory));
        ReturnAction returnAction = new ReturnAction(outputWriter, inputReader);
        returnAction.performAction(new IndexPage(outputWriter, bookInventory));
        assertEquals(getExpectedListOfBooks(), indexPage.getAvailableBooks());
    }

    private List<Book> getExpectedListOfBooks() {
        List<Book> expectedListOfBooks = new ArrayList<>();
        expectedListOfBooks.add(new Book("The Fountainhead", "Ayn Rand", 1943));
        expectedListOfBooks.add(new Book("The Alchemist", "Paulo Coelho", 1988));
        expectedListOfBooks.add(new Book("The Stars Shine Down", "Sidney Sheldon", 1992));
        return expectedListOfBooks;
    }
}
