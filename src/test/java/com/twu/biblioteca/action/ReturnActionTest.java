package com.twu.biblioteca.action;

import com.twu.biblioteca.*;
import com.twu.biblioteca.books.*;
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
        CheckoutActionTestHelper checkoutAction = new CheckoutActionTestHelper();
        checkoutAction.performAction(new UserInterface(outputWriter, bookInventory));
        ReturnActionTestHelper returnAction = new ReturnActionTestHelper();
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
