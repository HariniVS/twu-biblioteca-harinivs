package com.twu.biblioteca;

import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) {

        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        OutputWriter outputWriter = new OutputWriter(writer);
        Biblioteca biblioteca = new Biblioteca(outputWriter);

        BibliotecaApplication application = new BibliotecaApplication(biblioteca);
        application.run();
    }
}
