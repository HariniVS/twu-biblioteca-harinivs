package com.twu.biblioteca.menu;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.user.UserAuthentication;

public class LibrarianMenuTestHelper extends LibrarianMenu {
    private boolean actionPerformed;

    public LibrarianMenuTestHelper(Repository repository, OutputWriter outputWriter,
                                   InputReader inputReader, UserAuthentication userAuthentication) {
        super(repository, outputWriter, inputReader, userAuthentication);
    }

    @Override
    public void performAction(String userInput) {
        super.performAction(userInput);
        actionPerformed = true;
    }

    public boolean isActionPerformed() {
        return actionPerformed;
    }
}
