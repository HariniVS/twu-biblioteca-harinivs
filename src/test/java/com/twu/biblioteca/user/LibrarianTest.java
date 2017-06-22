package com.twu.biblioteca.user;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibrarianTest {

    @Test
    public void shouldGetTheLibrarianId() {
        Librarian librarian = new Librarian("Lib 1", "lib1@gmail.com", "Koramangala", 4567, "456-4567");

        String expectedId =  "456-4567";
        assertEquals(expectedId,librarian.getLibrarianId());
    }
}
