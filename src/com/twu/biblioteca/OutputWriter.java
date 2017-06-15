package com.twu.biblioteca;

import java.io.*;

public class OutputWriter {

    private final Writer writer;

    OutputWriter(Writer writer) {
        this.writer = writer;
    }

    void writeToTheConsole(String message) {
        try {
            writer.write(message + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
