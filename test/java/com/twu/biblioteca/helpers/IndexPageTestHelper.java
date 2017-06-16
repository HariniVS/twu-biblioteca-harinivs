package com.twu.biblioteca.helpers;

import com.twu.biblioteca.IndexPage;
import com.twu.biblioteca.OutputWriter;

public class IndexPageTestHelper extends IndexPage {

    private boolean isPerformActionCalled;
    private boolean isDisplayWelcomeMessageCalled;
    private boolean isDisplayMenuToUserCalled;
    private String defaultExitValue = "1";

    @Override
    public String getInputFromUser() {
        return defaultExitValue;
    }

    public IndexPageTestHelper(OutputWriter outputWriter) {
        super(outputWriter);
    }

    @Override
    public void displayWelcomeMessage() {
        super.displayWelcomeMessage();
        isDisplayWelcomeMessageCalled = true;
    }

    @Override
    public void displayMenuToUser() {
        super.displayMenuToUser();
        isDisplayMenuToUserCalled = true;
    }

    @Override
    public void performAction(String inputFromUser) {
        super.performAction(inputFromUser);
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
