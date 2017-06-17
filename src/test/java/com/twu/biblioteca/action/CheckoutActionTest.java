package com.twu.biblioteca.action;

import com.twu.biblioteca.Book;
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

    private StringWriter stringWriter;
    private OutputWriter outputWriter;
    private IndexPage indexPage;
    private InputReader inputReader;
    private List<Book> expectedListOfBooks;
    private String expectedBookName = "The Alchemist";

    @Before
    public void setUp() {
        stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        inputReader = new InputReaderTestHelper("The Alchemist");
        indexPage = new IndexPage(outputWriter);
    }

    @Test
    public void shouldReturnTheOption() {
        CheckoutAction checkoutAction = new CheckoutAction(outputWriter, inputReader);
        assertEquals("Checkout Book", checkoutAction.toString());
    }

    @Test
    public void shouldGetBookNameFromUser() {
        CheckoutAction checkoutAction = new CheckoutAction(outputWriter, inputReader);
        String bookName = checkoutAction.getBookNameFromUser();
        assertEquals(expectedBookName, bookName);
    }

    @Test
    public void shouldNotDisplayCheckedOutBook() {
        CheckoutAction checkoutAction = new CheckoutAction(outputWriter, inputReader);
        checkoutAction.performAction();
        assertEquals(getExpectedListOfBooks(), indexPage.getListOfAvailableBooks());
    }

    private List<Book> getExpectedListOfBooks() {
        expectedListOfBooks = new ArrayList<Book>();
        expectedListOfBooks.add(new Book("The Alchemist", "Paulo Coelho", 1988, true));
        expectedListOfBooks.add(new Book("Harry Potter And The Goblet Of Fire", "J K Rowling",
                2008, true));
        expectedListOfBooks.add(new Book("Harry Potter And The Order Of Phoenix", "J K Rowling",
                2012, true));
        return expectedListOfBooks;
    }
}
