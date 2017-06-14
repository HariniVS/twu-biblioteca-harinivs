package com.twu.biblioteca;

public class Book {

    private String name;
    private String author;
    private int publicationYear;
    private boolean availability;

    @Override
    public String toString() {
        return "Book" +
                "name = " + name +
                ", Author = " + author +
                ", Year of publication = " + publicationYear;
    }

    @Override
    public boolean equals(Object object) {
        Book book = (Book) object;
        return isEqual(book);
    }

    private boolean isEqual(Book book) {
        return book.getName().equals(name) && book.getAuthor().equals(author)
                && book.getPublicationYear() == publicationYear;
    }

    Book(String name, String author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
        availability = true;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isAvailable() {
        return availability;
    }
}
