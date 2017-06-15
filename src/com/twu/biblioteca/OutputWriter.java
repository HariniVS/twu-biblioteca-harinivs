package com.twu.biblioteca;

import java.io.*;

public class OutputWriter {

    private final Writer bufferedWriter;

    OutputWriter(Writer bufferedWriter) {
        this.bufferedWriter = bufferedWriter;
    }

    void printAvailableBooks(String book) {
        System.out.println(book);
        try {
            bufferedWriter.write(book+"\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
