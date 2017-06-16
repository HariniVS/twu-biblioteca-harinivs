package com.twu.biblioteca;

public class Workflow {

    private final IndexPage indexPage;

    int inputFromUser;

    public Workflow(IndexPage indexPage) {
        this.indexPage = indexPage;
    }

    public void start() {
        indexPage.displayWelcomeMessage();
        indexPage.displayListOfAvailableBooks();

        do {
            indexPage.displayMenuToUser();
            inputFromUser = indexPage.getInputFromUser();
            indexPage.performAction(inputFromUser);
        }while (inputFromUser != 2);
    }
}
