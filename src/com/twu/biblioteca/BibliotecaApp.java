package com.twu.biblioteca;

import java.io.StringWriter;

public class BibliotecaApp {

    public static void main(String[] args) {
        final StringWriter bufferedWriter = new StringWriter();
        OutputWriter outputWriter = new OutputWriter(bufferedWriter);
        Biblioteca biblioteca = new Biblioteca(outputWriter);
        System.out.println(biblioteca.getWELCOME_MESSAGE());
        biblioteca.printListOfAvailableBooks();
    }
}
