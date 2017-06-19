package com.twu.biblioteca.action;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.UserInterface;
import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.books.BookInventory;
import com.twu.biblioteca.helpers.InputReaderTestHelper;
import com.twu.biblioteca.menu.CheckoutAction;
import com.twu.biblioteca.menu.ReturnAction;
import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReturnActionTest {

    private OutputWriter outputWriter;
    private UserInterface indexPage;
    private BookInventory bookInventory;

    @Before
    public void setUp() {
        StringWriter stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        InputReader inputReader = new InputReaderTestHelper("The Alchemist");
        bookInventory = new BookInventory();
        indexPage = new UserInterface(outputWriter, bookInventory);
    }

    @Test
    public void shouldReturnOption() {
        ReturnAction returnAction = new ReturnAction();
        assertEquals("Return Book", returnAction.toString());
    }

    @Test
    public void shouldDisplayAReturnedBook() {
        CheckoutAction checkoutAction = new CheckoutAction();
        checkoutAction.performAction(new UserInterface(outputWriter, bookInventory));
        ReturnAction returnAction = new ReturnAction();
        returnAction.performAction(new UserInterface(outputWriter, bookInventory));
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
