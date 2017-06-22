package com.twu.biblioteca;

import com.twu.biblioteca.action.Action;

public class InvalidEntry implements Action {

    private OutputWriter outputWriter;
    private String invalidMessage = "Select a valid option!";

    public InvalidEntry(OutputWriter outputWriter) {
        this.outputWriter = outputWriter;
    }

    @Override
    public void performAction() {
        outputWriter.write(invalidMessage);
    }
}
