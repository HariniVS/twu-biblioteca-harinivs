package com.twu.biblioteca;

class Workflow {

    private final IndexPage indexPage;

    Workflow(IndexPage indexPage) {
        this.indexPage = indexPage;
    }

     void start() {

        indexPage.displayWelcomeMessage();

        String inputFromUser;
        do {
            indexPage.displayMenuToUser();
            inputFromUser = indexPage.getInputFromUser();
            indexPage.performAction(inputFromUser);
        } while (!inputFromUser.equals("4"));
    }
}
