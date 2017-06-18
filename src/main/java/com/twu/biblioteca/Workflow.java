package com.twu.biblioteca;

public class Workflow {

    private final IndexPage indexPage;

    private String inputFromUser;

    public Workflow(IndexPage indexPage) {
        this.indexPage = indexPage;
    }

    public void start() {

        indexPage.displayWelcomeMessage();

        do {
            indexPage.displayMenuToUser();
            inputFromUser = indexPage.getInputFromUser();
            indexPage.performAction(inputFromUser);
        } while (!inputFromUser.equals("4"));
    }
}
