package com.twu.biblioteca;

import java.io.OutputStreamWriter;

public class App {

    public static void main(String[] args) {

        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        OutputWriter outputWriter = new OutputWriter(writer);
        IndexPage indexPage = new IndexPage(outputWriter);

        Workflow workflow = new Workflow(indexPage);
        workflow.start();
    }
}
