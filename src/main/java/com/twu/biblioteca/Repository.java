package com.twu.biblioteca;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.item.Item;
import com.twu.biblioteca.movie.Movie;
import com.twu.biblioteca.user.User;
import com.twu.biblioteca.user.UserSession;

import java.util.*;

public class Repository {

    private final String BOOK_ITEM = "Book";
    private final String MOVIE_ITEM = "Movie";
    private Map<Item, String> availableItems;
    private Map<Item, User> checkedOutBooks;
    private Map<Item, User> checkedOutMovies;
    private List<Item> itemList;

    public Repository() {

        checkedOutBooks = new LinkedHashMap<>();
        checkedOutMovies = new LinkedHashMap<>();
        availableItems = new LinkedHashMap<>();

        addItem(new Movie("3 Idiots", 2011, "Raj Kumar", 9), "Movie");
        addItem(new Book("The Alchemist", "Paulo Coelho", 1988), "Book");
    }

    public void addItem(Item item, String type) {
        availableItems.put(item, type);
    }

    public List<Item> getItems(String itemName) {
        itemList = new ArrayList<>();
        for (Map.Entry<Item, String> eachItem : availableItems.entrySet()) {
            if (eachItem.getValue().equals(itemName)) {
                itemList.add(eachItem.getKey());
            }
        }
        return itemList;
    }

    public boolean checkoutItem(String itemNameFromUser, String itemName, User user) {
        final List<Item> items = getItems(itemName);
        if (itemName.equals(BOOK_ITEM)) {
            final Book book = getBook(itemNameFromUser, items);
            availableItems.remove(book);
            checkedOutBooks.put(book, UserSession.currentUser);
            return true;
        }
        if (itemName.equals(MOVIE_ITEM)) {
            final Movie movie = getMovie(itemNameFromUser, items);
            availableItems.remove(movie);
            checkedOutMovies.put(movie, UserSession.currentUser);
            return true;
        }
        return false;
    }

    public boolean returnItem(String itemNameFromUser, String itemName, User user) {

        final List<Item> items = getItems(itemName);
        if (itemName.equals(BOOK_ITEM)) {
            Book book = getCheckedBook(checkedOutBooks, itemNameFromUser);
            checkedOutBooks.remove(book);
            availableItems.put(book, BOOK_ITEM);
            return true;
        }
        if (itemName.equals(MOVIE_ITEM)) {
            Movie movie = getCheckedMovie(checkedOutMovies, itemNameFromUser);
            checkedOutMovies.remove(movie);
            availableItems.put(movie, MOVIE_ITEM);
            return true;
        }
        return false;
    }

    private Book getCheckedBook(Map<Item, User> checkedOutBooks, String itemNameFromUser) {
        for (Map.Entry<Item, User> books : checkedOutBooks.entrySet()){
            final Book book = (Book) books.getKey();
            if(book.getName().equals(itemNameFromUser)) {
                return book;
            }
        }
        return null;
    }

    private Movie getCheckedMovie(Map<Item, User> checkedOutMovies, String itemNameFromUser) {
        for (Map.Entry<Item, User> movies : checkedOutBooks.entrySet()){
            final Movie movie = (Movie) movies.getKey();
            if(movie.getMovieName().equals(itemNameFromUser)) {
                return movie;
            }
        }
        return null;
    }

    private Movie getMovie(String itemNameFromUser, List<Item> items) {
        for (Item item : items) {
            Movie movie = (Movie) item;
            if (movie.getMovieName().equals(itemNameFromUser)) {
                return movie;
            }
        }
        return null;
    }

    private Book getBook(String itemNameFromUser, List<Item> items) {
        for (Item item : items) {
            Book book = (Book) item;
            if (book.getName().equals(itemNameFromUser)) {
                return book;
            }
        }
        return null;
    }

    public Map<Item, User> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    public Map<Item, User> getCheckedOutMovies() {
        return checkedOutMovies;
    }
}
