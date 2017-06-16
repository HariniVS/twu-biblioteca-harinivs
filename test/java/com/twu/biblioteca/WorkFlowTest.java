package com.twu.biblioteca;

import com.twu.biblioteca.helpers.IndexPageTestHelper;
import org.junit.Before;
import org.junit.Test;

import java.io.OutputStreamWriter;

import static org.junit.Assert.assertTrue;

public class WorkFlowTest {

    private Workflow workflow;
    private OutputStreamWriter writer;
    private OutputWriter outputWriter;
    private IndexPageTestHelper indexPageTestHelper;

    @Before
    public void setUp() {
        writer = new OutputStreamWriter(System.out);
        outputWriter = new OutputWriter(writer);
        indexPageTestHelper = new IndexPageTestHelper(outputWriter);
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
