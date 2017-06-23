package com.twu.biblioteca.action;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.QuitProgramException;

public class Quit implements Action {

    private final OutputWriter outputWriter;

    public Quit(OutputWriter outputWriter) {
        this.outputWriter = outputWriter;
    }

    @Override
    public String toString() {
        return "Quit";
    }

    @Override
    public void performAction() {
        outputWriter.write("Thank you for using Bangalore Public Library !!");
        throw new QuitProgramException();
    }
}
