package com.twu.biblioteca;


public class Book {

    private String name;
    private String author;
    private int publicationYear;

    @Override
    public String toString() {
        return String.format("%-50s%-20s%-20s",name, author, publicationYear);
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

    public Book(String name, String author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }

    int getPublicationYear() { return publicationYear; }
}
