package com.twu.biblioteca;

import java.io.*;

public class OutputWriter {

    private final Writer writer;

    public OutputWriter(Writer writer) {
        this.writer = writer;
    }

    void write(String message) {
        try {
            writer.write(message + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
