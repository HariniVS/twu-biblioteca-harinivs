package com.twu.biblioteca;

class Workflow {

    private final UserInterface indexPage;

    Workflow(UserInterface indexPage) {
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
