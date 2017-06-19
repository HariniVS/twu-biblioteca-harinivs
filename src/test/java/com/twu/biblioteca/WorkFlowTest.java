package com.twu.biblioteca;

import com.twu.biblioteca.books.BookInventory;
import com.twu.biblioteca.helpers.IndexPageTestHelper;
import org.junit.Before;
import org.junit.Test;

import java.io.OutputStreamWriter;

import static org.junit.Assert.assertTrue;

public class WorkFlowTest {

    private Workflow workflow;
    private IndexPageTestHelper indexPageTestHelper;
    private BookInventory bookInventory;


    @Before
    public void setUp() {
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        OutputWriter outputWriter = new OutputWriter(writer);
        bookInventory = new BookInventory();
        indexPageTestHelper = new IndexPageTestHelper(outputWriter, bookInventory);
        workflow = new Workflow(indexPageTestHelper);
    }

    @Test
    public void shouldUseIndexPageToDisplayWelcomeMessage() {
        workflow.start();
        assertTrue(indexPageTestHelper.isDisplayWelcomeMessageCalled());
    }

    @Test
    public void shouldUseDisplayMenuToUser() {
        workflow.start();
        assertTrue(indexPageTestHelper.isDisplayMenuToUserCalled());
    }

}
