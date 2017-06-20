package com.twu.biblioteca.menu;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;

public class LibrarianMenuTestHelper extends LibrarianMenu{
    private boolean actionPerformed;

    public LibrarianMenuTestHelper(Repository repository, OutputWriter outputWriter, InputReader inputReader) {
        super(repository, outputWriter, inputReader);
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
