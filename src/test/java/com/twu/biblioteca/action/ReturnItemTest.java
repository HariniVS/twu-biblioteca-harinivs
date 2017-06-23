package com.twu.biblioteca.action;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.helpers.CheckoutItemHelper;
import com.twu.biblioteca.helpers.ReturnItemHelper;
import com.twu.biblioteca.user.UserAuthentication;
import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class ReturnItemTest {

    @Test
    public void shouldDisplayReturnMenu() {
        ReturnItem returnItem = new ReturnItem(new Repository(), new OutputWriter(new StringWriter()), "Book");
        assertEquals("Return Book", returnItem.toString());
    }

    @Test
    public void shouldNotBeAbleToReturnUncheckedOutMovie() {
        final StringWriter writer = new StringWriter();
        ReturnItemHelper returnItem = new ReturnItemHelper(new Repository(), new OutputWriter
                (writer), "Book");

        returnItem.performAction();
        assertEquals("That is not a valid Book to return.\n", writer.getBuffer().toString());
    }

    @Test
    public void shouldReturnCheckedOutBook() {
        final StringWriter writer = new StringWriter();
        ReturnItemHelper returnItem = new ReturnItemHelper(new Repository(), new OutputWriter
                (writer), "Book");
        CheckoutItemHelper checkoutItem = new CheckoutItemHelper(new Repository(),
                new OutputWriter(writer), "Book", new UserAuthentication());

        checkoutItem.performAction();
        returnItem.performAction();
        assertEquals("Thank you! Enjoy the Book\n" +
                "That is not a valid Book to return.\n", writer.getBuffer().toString());
    }
}
