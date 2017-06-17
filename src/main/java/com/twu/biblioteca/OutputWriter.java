package com.twu.biblioteca;

import java.io.IOException;
import java.io.Writer;

public class OutputWriter {

    private final Writer writer;

    public OutputWriter(Writer writer) {
        this.writer = writer;
    }

    public void write(String message) {
        try {
            writer.write(message + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
