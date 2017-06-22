package com.twu.biblioteca.helpers;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.menu.Login;

public class LoginHelper extends Login{

    private final InputReader inputReader;
    private boolean isCredentialsRead;
    private String userId;
    private String password;

    public LoginHelper(OutputWriter outputWriter, InputReader inputReader) {
        super(outputWriter, inputReader);
        this.inputReader = inputReader;
    }

    @Override
    public void performAction() {
        super.performAction();
    }

    @Override
    public void readUserCredential() {
        userId = inputReader.readInput();
        password = inputReader.readInput();
        isCredentialsRead = true;
    }

    public boolean isCredentialsRead() {
        return isCredentialsRead;
    }

}
