package com.twu.biblioteca.menu;

import com.twu.biblioteca.OutputWriter;

public class QuitAction implements Action {

    private final OutputWriter outputWriter;

    public QuitAction(OutputWriter outputWriter) {
        this.outputWriter = outputWriter;
    }

    @Override
    public String toString() {
        return "Quit";
    }

    @Override
    public void performAction() {
        outputWriter.write("Thank you for using Bangalore Public Library !!");
    }
}
