package com.twu.biblioteca;

import com.twu.biblioteca.user.UserAuthentication;

import java.io.OutputStreamWriter;

public class App {

    public static void main(String[] args) {

        InputReader inputReader = new InputReader();
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        OutputWriter outputWriter = new OutputWriter(writer);
        Repository repository = new Repository();
        UserAuthentication userAuthentication = new UserAuthentication();
        UserInterface userInterface = new UserInterface(outputWriter, inputReader, repository, userAuthentication);

        Workflow workflow = new Workflow(userInterface);
        workflow.start();
    }
}
