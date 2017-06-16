package com.twu.biblioteca;

import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class WorkFlowTest {

    String expectedSequence = "Bangalore Public Library Welcomes You\n" +
            "Book name = Harry Potter And The Goblet Of Fire, Author = J K Rowling, Year of publication = 2008\n" +
            "Book name = Harry Potter And The Order Of Phoenix, Author = J K " +
            "Rowling, Year of publication = 2012\n";

    @Test
    public void shouldDisplayEntriesOnIndexPageInPredefinedOrder() {

        final StringWriter stringWriter = new StringWriter();
        OutputWriter outputWriter = new OutputWriter(stringWriter);
        IndexPage indexPage = new IndexPage(outputWriter);
        Workflow workflow = new Workflow(indexPage);

        workflow.start();

        final StringBuffer stringBuffer = stringWriter.getBuffer();
        assertEquals(expectedSequence, stringBuffer.toString());
    }
}
