package com.twu.biblioteca;

import com.twu.biblioteca.books.BookInventory;

import java.io.OutputStreamWriter;

public class App {

    public static void main(String[] args) {

        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        OutputWriter outputWriter = new OutputWriter(writer);
        BookInventory bookInventory = new BookInventory();
        IndexPage indexPage = new IndexPage(outputWriter, bookInventory);

        Workflow workflow = new Workflow(indexPage);
        workflow.start();
    }
}
