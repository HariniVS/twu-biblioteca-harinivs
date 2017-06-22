package com.twu.biblioteca.helpers;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.UserInterface;
import com.twu.biblioteca.Repository;

import java.io.StringWriter;

public class UserInterfaceTestHelper extends UserInterface {

    private boolean isPerformActionCalled;
    private boolean isDisplayWelcomeMessageCalled;
    private boolean isDisplayMenuToUserCalled;
    private final String DEFAULT_EXIT_VALUE = "4";

    public UserInterfaceTestHelper(OutputWriter outputWriter, InputReader inputReader, Repository repository) {
        super(outputWriter, inputReader, repository);
    }

    @Override
    public String getInputFromUser() {
        return DEFAULT_EXIT_VALUE;
    }

    @Override
    public void displayWelcomeMessage() {
        super.displayWelcomeMessage();
        isDisplayWelcomeMessageCalled = true;
    }

    @Override
    public void displayMenu(String userType) {
        super.displayMenu(userType);
        isDisplayMenuToUserCalled = true;
    }

    @Override
    public void performAction(String input, String inputType) {
        super.performAction(input, inputType);
        isPerformActionCalled = true;
    }

    public boolean isPerformActionCalled() {
        return isPerformActionCalled;
    }

    public boolean isDisplayWelcomeMessageCalled() {
        return isDisplayWelcomeMessageCalled;
    }

    public boolean isDisplayMenuToUserCalled() {
        return isDisplayMenuToUserCalled;
    }
}
