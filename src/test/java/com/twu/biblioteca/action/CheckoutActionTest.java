package com.twu.biblioteca.action;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.IndexPage;
import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.helpers.InputReaderTestHelper;
import com.twu.biblioteca.menu.CheckoutAction;
import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CheckoutActionTest {

    private OutputWriter outputWriter;
    private IndexPage indexPage;
    private InputReader inputReader;

    @Before
    public void setUp() {
        StringWriter stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        inputReader = new InputReaderTestHelper("The Alchemist");
        indexPage = new IndexPage(outputWriter);
    }

    @Test
    public void shouldReturnOption() {
        CheckoutAction checkoutAction = new CheckoutAction(outputWriter, inputReader);
        assertEquals("Checkout Book", checkoutAction.toString());
    }

    @Test
    public void shouldGetBookNameFromUser() {
        CheckoutAction checkoutAction = new CheckoutAction(outputWriter, inputReader);
        String bookName = checkoutAction.getBookNameFromUser();
        String expectedBookName = "The Alchemist";
        assertEquals(expectedBookName, bookName);
    }

    @Test
    public void shouldNotDisplayCheckedOutBook() {
        CheckoutAction checkoutAction = new CheckoutAction(outputWriter, inputReader);
        checkoutAction.performAction();
        assertEquals(getExpectedListOfBooks(), indexPage.getAvailableBooks());
    }

    private List<Book> getExpectedListOfBooks() {
        List<Book> expectedListOfBooks = new ArrayList<>();
        expectedListOfBooks.add(new Book("The Fountainhead", "Ayn Rand", 1943));
        expectedListOfBooks.add(new Book("The Stars Shine Down", "Sidney Sheldon", 1992));
        return expectedListOfBooks;
    }
}
