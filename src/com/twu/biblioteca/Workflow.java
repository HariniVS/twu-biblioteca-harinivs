package com.twu.biblioteca;

public class Workflow {

    private final IndexPage indexPage;

    public Workflow(IndexPage indexPage) {
        this.indexPage = indexPage;
    }

    public void start() {
        indexPage.displayWelcomeMessage();
        indexPage.displayListOfAvailableBooks();
    }
}
