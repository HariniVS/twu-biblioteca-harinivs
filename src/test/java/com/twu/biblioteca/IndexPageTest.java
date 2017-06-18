package com.twu.biblioteca;

import com.twu.biblioteca.helpers.IndexPageTestHelper;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IndexPageTest {

    private OutputWriter outputWriter;
    private StringWriter stringWriter;
    private IndexPage indexPage;

    private String expectedMenu = "Enter the menu of your choice\n" +
            "1 List Books\n" +
            "2 Checkout Book\n" +
            "3 Return Book\n" +
            "4 Quit\n";

    @Test
    public void shouldDisplayMenu() {
        stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        indexPage = new IndexPage(outputWriter);

        indexPage.displayMenuToUser();
        final StringBuffer stringBuffer = stringWriter.getBuffer();

        assertEquals(expectedMenu, stringBuffer.toString());
    }

    @Test
    public void shouldTakeUserInput() {
        String input = "1";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        assertEquals("1", new InputReader().readInput());
    }

    @Test
    public void shouldPerformActionBasedOnUserInput() {
        stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        indexPage = new IndexPage(outputWriter);

        IndexPageTestHelper helper = new IndexPageTestHelper(outputWriter);
        helper.performAction("1");

        assertTrue(helper.isPerformActionCalled());
    }
}


