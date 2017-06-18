package com.twu.biblioteca;

import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class OutputWriterTest {

    @Test
    public void shouldDisplayToConsole() {
        StringWriter stringWriter = new StringWriter();
        OutputWriter outputWriter = new OutputWriter(stringWriter);
        outputWriter.write("Bangalore Public Library Welcomes " +
                "You");
        assertEquals("Bangalore Public Library Welcomes You\n", stringWriter
                .getBuffer().toString());
    }
}
