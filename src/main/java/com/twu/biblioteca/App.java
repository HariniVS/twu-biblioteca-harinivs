package com.twu.biblioteca;

import java.io.OutputStreamWriter;

public class App {

    public static void main(String[] args) {

        InputReader inputReader = new InputReader();
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        OutputWriter outputWriter = new OutputWriter(writer);
        Repository repository = new Repository();
        UserInterface userInterface = new UserInterface(outputWriter, inputReader, repository);

        Workflow workflow = new Workflow(userInterface);
        workflow.start();
    }
}
