package com.twu.biblioteca;

import java.io.*;

public class OutputWriter {

    private final Writer writer;

    OutputWriter(Writer writer) {
        this.writer = writer;
    }

    void displayAvailableBooks(String book) {
        try {
            writer.write(book + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
