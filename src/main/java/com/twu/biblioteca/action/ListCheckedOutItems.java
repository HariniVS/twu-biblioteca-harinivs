package com.twu.biblioteca.action;

import com.twu.biblioteca.OutputWriter;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.item.Item;
import com.twu.biblioteca.movie.Movie;
import com.twu.biblioteca.user.User;

import java.util.LinkedHashMap;
import java.util.Map;


public class ListCheckedOutItems implements Action {
    private final String book = "Book";
    private final String itemName;
    private final Repository repository;
    private final OutputWriter outputWriter;
    private Map<Item, User> checkedOutItems;

    public ListCheckedOutItems(Repository repository, OutputWriter outputWriter, String itemName) {
        this.repository = repository;
        this.outputWriter = outputWriter;
        this.itemName = itemName;
        checkedOutItems = new LinkedHashMap<>();
    }

    @Override
    public String toString() {
        return "List CheckedOut " + itemName;
    }

    @Override
    public void performAction() {
        checkedOutItems = repository.getCheckedOutItem();
        if (itemName.equals(book)) {
            displayCheckedOutBooks();
            return;
        }
        displayCheckedOutMovies();
    }

    private void displayCheckedOutMovies() {
        for (Map.Entry<Item, User> checkedOutItem : checkedOutItems.entrySet()) {
            final Item item = checkedOutItem.getKey();
            if (item instanceof Movie) {
                displayItem(checkedOutItem, item);
            }
        }
    }

    private void displayCheckedOutBooks() {
        for (Map.Entry<Item, User> checkedOutItem : checkedOutItems.entrySet()) {
            final Item item = checkedOutItem.getKey();
            if (item instanceof Book) {
                displayItem(checkedOutItem, item);
            }
        }
    }

    private void displayItem(Map.Entry<Item, User> checkedOutItem, Item item) {
        outputWriter.write(item.toString() + " " +
                checkedOutItem.getValue().toString());
    }

}
