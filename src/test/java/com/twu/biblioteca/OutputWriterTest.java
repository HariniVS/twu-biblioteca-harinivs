package com.twu.biblioteca;

import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class OutputWriterTest {
    private StringWriter stringWriter;
    private OutputWriter outputWriter;

    @Test
    public void shouldDisplayToConsole() {
        stringWriter = new StringWriter();
        outputWriter = new OutputWriter(stringWriter);
        outputWriter.write("Bangalore Public Library Welcomes " +
                "You");
        assertEquals("Bangalore Public Library Welcomes You\n", stringWriter
                .getBuffer().toString());
    }
}
