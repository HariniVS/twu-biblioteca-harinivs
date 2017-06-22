package com.twu.biblioteca.action;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.item.Item;
import com.twu.biblioteca.Repository;

import java.util.List;

public class ListItems implements Action {

    private final Repository repository;
    private final OutputWriter outputWriter;
    private final String itemName;

    public ListItems(Repository repository, OutputWriter outputWriter, String itemName) {
        this.repository = repository;
        this.outputWriter = outputWriter;
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "List "+itemName+"s";
    }

    @Override
    public void performAction() {
        List<Item> items = repository.getItems(itemName);
        for (Item item : items) {
            outputWriter.write(item.toString());
        }
    }
}
