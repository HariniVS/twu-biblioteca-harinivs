package com.twu.biblioteca;

class Workflow {

    private final UserInterface indexPage;

    Workflow(UserInterface indexPage) {
        this.indexPage = indexPage;
    }

    void start() {

        indexPage.displayWelcomeMessage();

        String inputFromUser;
        final String QUIT = "4";
        do {
            indexPage.displayMenuToUser();
            inputFromUser = indexPage.getInputFromUser();
            indexPage.performAction(inputFromUser);
        } while (!inputFromUser.equals(QUIT));
    }
}
