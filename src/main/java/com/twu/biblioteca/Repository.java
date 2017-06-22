package com.twu.biblioteca;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.item.Item;
import com.twu.biblioteca.movie.Movie;
import com.twu.biblioteca.user.User;
import com.twu.biblioteca.user.UserSession;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Repository {

    private Map<Item, String> availableItems;
    private Map<Item, User> checkedOutItems;

    public Repository() {

        checkedOutItems = new LinkedHashMap<>();
        availableItems = new LinkedHashMap<>();

        addItem(new Movie("3 Idiots", 2011, "Raj Kumar", 9), "Movie");
        addItem(new Book("The Alchemist", "Paulo Coelho", 1988), "Book");
    }

    void addItem(Item item, String type) {
        availableItems.put(item, type);
    }

    public List<Item> getItems(String itemName) {
        List<Item> itemList = new ArrayList<>();
        for (Map.Entry<Item, String> eachItem : availableItems.entrySet()) {
            if (eachItem.getValue().equals(itemName)) {
                itemList.add(eachItem.getKey());
            }
        }
        return itemList;
    }

    public boolean checkoutItem(String itemNameFromUser, String itemName) {
        final List<Item> items = getItems(itemName);
        final Item item = getItem(itemNameFromUser, items);
        if (item != null) {
            availableItems.remove(item);
            checkedOutItems.put(item, UserSession.getCurrentUser());
            return true;
        }
        return false;
    }

    public boolean returnItem(String itemNameFromUser, String itemName) {

        Item item = getCheckedOutItem(checkedOutItems, itemNameFromUser);
        if (item != null) {
            checkedOutItems.remove(item);
            availableItems.put(item, itemName);
            return true;
        }
        return false;
    }

    private Item getCheckedOutItem(Map<Item, User> checkedOutItems, String itemNameFromUser) {
        for (Map.Entry<Item, User> item : checkedOutItems.entrySet()) {
            Item currentItem = item.getKey();
            if(currentItem instanceof Book) {
                if (((Book) currentItem).getName().equals(itemNameFromUser)) {
                    return currentItem;
                }
            }
            if(currentItem instanceof Movie) {
                if (((Movie) currentItem).getName().equals(itemNameFromUser)) {
                    return currentItem;
                }
            }
        }
        return null;
    }

    private Item getItem(String itemNameFromUser, List<Item> items) {
        for (Item item : items) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getName().equals(itemNameFromUser)) {
                    return book;
                }
            }
            if (item instanceof Movie) {
                Movie movie = (Movie) item;
                if (movie.getName().equals(itemNameFromUser)) {
                    return movie;
                }
            }
        }
        return null;
    }

    public Map<Item, User> getCheckedOutItem() {
        return checkedOutItems;
    }

}
