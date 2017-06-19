package com.twu.biblioteca.action;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.UserInterface;
import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.books.BookInventory;
import com.twu.biblioteca.menu.CheckoutAction;
import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CheckoutActionTest {

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
        CheckoutAction checkoutAction = new CheckoutAction();
        assertEquals("Checkout Book", checkoutAction.toString());
    }

    @Test
    public void shouldGetBookNameFromUser() {
        CheckoutActionTestHelper checkoutAction = new CheckoutActionTestHelper();
        String bookName = checkoutAction.getBookNameFromUser();
        String expectedBookName = "The Alchemist";
        assertEquals(expectedBookName, bookName);
    }

    @Test
    public void shouldNotDisplayCheckedOutBook() {
        CheckoutActionTestHelper checkoutAction = new CheckoutActionTestHelper();
        checkoutAction.performAction(new UserInterface(outputWriter, bookInventory));
        assertEquals(getExpectedListOfBooks(), indexPage.getAvailableBooks());
    }

    private List<Book> getExpectedListOfBooks() {
        List<Book> expectedListOfBooks = new ArrayList<>();
        expectedListOfBooks.add(new Book("The Fountainhead", "Ayn Rand", 1943));
        expectedListOfBooks.add(new Book("The Stars Shine Down", "Sidney Sheldon", 1992));
        return expectedListOfBooks;
    }
}
