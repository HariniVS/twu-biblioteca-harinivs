package com.twu.biblioteca;


public class Book {

    private String name;
    private String author;
    private int publicationYear;

    @Override
    public String toString() {
        return "" + name + " \t\t|" + author + " \t\t|" + publicationYear + "";
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
}