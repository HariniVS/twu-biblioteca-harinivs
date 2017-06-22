package com.twu.biblioteca.action;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.helpers.CheckoutItemTestHelper;
import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class CheckoutItemTest {

    @Test
    public void shouldDisplayCheckoutMenu() {
        CheckoutItem checkout = new CheckoutItem(
                new Repository(), new OutputWriter(new StringWriter()), "Book");

        assertEquals("Checkout Book", checkout.toString());
    }

    @Test
    public void shouldGetBookNameFromUser() {
        CheckoutItemTestHelper checkout = new CheckoutItemTestHelper(
                new Repository(), new OutputWriter(new StringWriter()), "Book");
        String bookName = checkout.getBookNameFromUser();
        String expectedBookName = "The Alchemist";
        assertEquals(expectedBookName, bookName);
    }

    @Test
    public void shouldCheckoutItem() {
        final StringWriter writer = new StringWriter();
        CheckoutItemTestHelper checkout = new CheckoutItemTestHelper(
                new Repository(), new OutputWriter(writer), "Book");
        checkout.performAction();

        assertEquals("Thank you! Enjoy the Book\n", writer.getBuffer().toString());
    }
}
