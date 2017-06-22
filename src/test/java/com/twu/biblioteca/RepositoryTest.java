package com.twu.biblioteca;

import com.twu.biblioteca.books.Book;
import com.twu.biblioteca.item.Item;
import com.twu.biblioteca.movie.Movie;
import com.twu.biblioteca.user.User;
import com.twu.biblioteca.user.UserSession;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    @Test
    public void shouldBeAbleToAddBooks() {
        Repository repository = new Repository();
        repository.addItem(new Book("The Alchemist", "Paulo Coelho", 1988), "Book");

    }

    @Test
    public void shouldBeAbleToAddMovies() {
        Repository repository = new Repository();
        repository.addItem(new Movie("3 Idiots", 2011, "Raj Kumar", 9), "Movie");
    }

    @Test
    public void shouldReturnAllBooks() {
        Repository repository = new Repository();
        final List<Item> books = repository.getItems("Book");
        List<Item> expectedBookList = new ArrayList<>();
        expectedBookList.add(new Book("The Alchemist", "Paulo Coelho", 1988));

        assertEquals(expectedBookList, books);
    }

    @Test
    public void shouldReturnAllMovies() {
        Repository repository = new Repository();
        final List<Item> movies = repository.getItems("Movie");
        List<Item> expectedMovieList = new ArrayList<>();
        expectedMovieList.add(new Movie("3 Idiots", 2011, "Raj Kumar", 9));

        assertEquals(expectedMovieList, movies);
    }

    @Test
    public void shouldCheckoutBook() {
        Repository repository = new Repository();
        repository.checkoutItem("The Alchemist", "Book", UserSession.getCurrentUser());
        final List<Item> books = repository.getItems("Book");
        List<Item> expectedBookList = new ArrayList<>();

        assertEquals(expectedBookList, books);
    }

    @Test
    public void shouldCheckoutMovie() {
        Repository repository = new Repository();
        repository.checkoutItem("3 Idiots", "Movie");
        final List<Item> movies = repository.getItems("Movie");
        List<Item> expectedMovieList = new ArrayList<>();

        assertEquals(expectedMovieList, movies);
    }

    @Test
    public void shouldReturnCheckedOutMovies() {
        Repository repository = new Repository();
        final User user = new User("User 1", "user1@gmail.com",
                "Koramangala", 1234, "123-1234");
        final UserSession session = new UserSession();
        session.setCurrentUser(user);
        repository.checkoutItem("3 Idiots", "Movie");

        Map<Movie, User> expectedCheckedOutMovies  = new LinkedHashMap<>();
        expectedCheckedOutMovies.put(new Movie("3 Idiots", 2011, "Raj Kumar", 9), user);
        assertEquals(expectedCheckedOutMovies.toString(),repository.getCheckedOutItem()
                .toString());
    }

    @Test
    public void shouldReturnCheckedOutBooks() {
        Repository repository = new Repository();
        final User user = new User("User 1", "user1@gmail.com",
                "Koramangala", 1234, "123-1234");
        final UserSession session = new UserSession();
        session.setCurrentUser(user);
        repository.checkoutItem("The Alchemist", "Book");

        Map<Book, User> expectedCheckedOutBooks  = new LinkedHashMap<>();
        expectedCheckedOutBooks.put(new Book("The Alchemist", "Paulo Coelho", 1988), user);
        assertEquals(expectedCheckedOutBooks.toString(), repository.getCheckedOutItem()
                .toString());
    }

    @Test
    public void shouldBeAbleToReturnBook() {
        Repository repository = new Repository();
        final User user = new User("User 1", "user1@gmail.com",
                "Koramangala", 1234, "123-1234");
        final UserSession session = new UserSession();
        session.setCurrentUser(user);
        repository.checkoutItem("The Alchemist", "Book");
        repository.returnItem("The Alchemist", "Book");


        List<Book> expectedListOfBooks  = new ArrayList<>();
        expectedListOfBooks.add(new Book("The Alchemist", "Paulo Coelho", 1988));
        assertEquals(expectedListOfBooks, repository.getItems("Book"));
    }
}
