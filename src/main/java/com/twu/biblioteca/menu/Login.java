package com.twu.biblioteca.menu;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.action.Action;
import com.twu.biblioteca.user.Password;
import com.twu.biblioteca.user.UserAuthentication;

public class Login implements Action {

    private String userId;
    private String password;
    private final InputReader inputReader;
    private final OutputWriter outputWriter;
    private UserAuthentication userAuthentication;

    public Login(OutputWriter outputWriter, InputReader inputReader, UserAuthentication userAuthentication) {
        this.outputWriter = outputWriter;
        this.inputReader = inputReader;
        this.userAuthentication = userAuthentication;
    }

    @Override
    public String toString() {
        return "Login";
    }

    @Override
    public void performAction() {
        readUserCredential();
        if (userAuthentication.authenticate(userId, new Password(password))) {
            outputWriter.write("Login Successful.");
        } else {
            outputWriter.write("Invalid User Id or Password.");
        }
    }

    public void readUserCredential() {
        outputWriter.write("Enter User Id");
        userId = inputReader.readInput();
        outputWriter.write("Enter Password");
        password = inputReader.readInput();
    }
}
