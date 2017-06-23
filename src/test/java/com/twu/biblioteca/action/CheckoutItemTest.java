package com.twu.biblioteca.action;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.helpers.CheckoutItemHelper;
import com.twu.biblioteca.user.UserAuthentication;
import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class CheckoutItemTest {

    @Test
    public void shouldDisplayCheckoutMenu() {
        CheckoutItem checkout = new CheckoutItem(
                new Repository(), new OutputWriter(new StringWriter()), "Book", new UserAuthentication());

        assertEquals("Checkout Book", checkout.toString());
    }

    @Test
    public void shouldGetBookNameFromUser() {
        CheckoutItemHelper checkout = new CheckoutItemHelper(
                new Repository(), new OutputWriter(new StringWriter()), "Book", new UserAuthentication());
        String bookName = checkout.getBookNameFromUser();
        String expectedBookName = "The Alchemist";
        assertEquals(expectedBookName, bookName);
    }

    @Test
    public void shouldCheckoutItem() {
        final StringWriter writer = new StringWriter();
        CheckoutItemHelper checkout = new CheckoutItemHelper(
                new Repository(), new OutputWriter(writer), "Book", new UserAuthentication());
        checkout.performAction();

        assertEquals("Thank you! Enjoy the Book\n", writer.getBuffer().toString());
    }
}
