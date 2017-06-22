package com.twu.biblioteca.action;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.helpers.ListCheckedOutItemsTestHelper;
import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertTrue;

public class ListCheckedOutItemsTest {

    @Test
    public void shouldCallPerformAction() {
        final StringWriter writer = new StringWriter();
        ListCheckedOutItemsTestHelper listItems = new ListCheckedOutItemsTestHelper(new Repository(),
                new OutputWriter(writer),"Book");
        listItems.performAction();

        assertTrue(listItems.isPerformActionCalled());
    }
}
