package com.twu.biblioteca.menu;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.action.Action;
import com.twu.biblioteca.user.UserAuthentication;

public class UserInformation implements Action {
    private final OutputWriter outputWriter;
    private UserAuthentication userAuthentication;

    UserInformation(OutputWriter outputWriter, UserAuthentication userAuthentication) {
        this.outputWriter = outputWriter;
        this.userAuthentication = userAuthentication;
    }

    @Override
    public String toString() {
        return "View Profile";
    }

    @Override
    public void performAction() {
        outputWriter.write(userAuthentication.getCurrentUser().toString());
    }
}
