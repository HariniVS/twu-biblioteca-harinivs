package com.twu.biblioteca;

import com.twu.biblioteca.action.Action;
import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class InvalidEntryTest {

    @Test
    public void shouldDisplayErrorMessage() {
        final StringWriter writer = new StringWriter();
        Action action = new InvalidEntry(new OutputWriter(writer));
        action.performAction();

        assertEquals("Select a valid option!\n",writer.getBuffer().toString());
    }
}
