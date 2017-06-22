package com.twu.biblioteca.menu;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.action.Action;
import com.twu.biblioteca.user.User;
import com.twu.biblioteca.user.UserSession;

public class UserInformation implements Action {
    private final OutputWriter outputWriter;

    UserInformation(OutputWriter outputWriter) {
        this.outputWriter = outputWriter;
    }

    @Override
    public String toString() {
        return "View Profile";
    }

    @Override
    public void performAction() {
        final UserSession session = new UserSession();
        final User currentUser = session.getCurrentUser();
        outputWriter.write(currentUser.toString());
    }
}
