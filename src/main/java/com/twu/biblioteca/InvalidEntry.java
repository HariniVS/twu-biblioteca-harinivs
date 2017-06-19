package com.twu.biblioteca;

import com.twu.biblioteca.menu.Action;

public class InvalidEntry implements Action {

    private OutputWriter outputWriter;
    private String invalidMessage = "Select a valid option!";

    public InvalidEntry(OutputWriter outputWriter) {
        this.outputWriter = outputWriter;
    }

    @Override
    public String toString() {
        return invalidMessage;
    }

    @Override
    public void performAction(IndexPage indexPage) {
        outputWriter.write(invalidMessage);
    }
}
