package com.twu.biblioteca.helpers;

import com.twu.biblioteca.InputReader;
import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserInterface;
import com.twu.biblioteca.user.UserAuthentication;

public class UserInterfaceTestHelper extends UserInterface {

    private boolean isPerformActionCalled;
    private boolean isDisplayWelcomeMessageCalled;
    private boolean isDisplayMenuToUserCalled;
    private final String DEFAULT_EXIT_VALUE = "4";

    public UserInterfaceTestHelper(OutputWriter outputWriter, InputReader inputReader, Repository repository,
                                   UserAuthentication userAuthentication) {
        super(outputWriter, inputReader, repository, userAuthentication);
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
    public void displayMenu() {
        super.displayMenu();
        isDisplayMenuToUserCalled = true;
    }

    @Override
    public void performAction(String input) {
        super.performAction(input);
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
