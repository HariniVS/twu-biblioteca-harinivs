package com.twu.biblioteca;

import org.junit.Test;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class BibliotecaApplicationTest {

    String expectedSequence = "Bangalore Public Library Welcomes You\n" +
            "Book name = Harry Potter And The Goblet Of Fire, Author = J K Rowling, Year of publication = 2008\n" +
            "Book name = Harry Potter And The Order Of Phoenix, Author = J K " +
            "Rowling, Year of publication = 2012\n";

    @Test
    public void shouldTestTheSequenceOfInput() {

        final StringWriter stringWriter = new StringWriter();
        OutputWriter outputWriter = new OutputWriter(stringWriter);
        Biblioteca biblioteca = new Biblioteca(outputWriter);
        BibliotecaApplication application = new BibliotecaApplication(biblioteca);

        application.run();

        final StringBuffer stringBuffer = stringWriter.getBuffer();
        assertEquals(expectedSequence,stringBuffer.toString());
    }
}
