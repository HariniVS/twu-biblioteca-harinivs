package com.twu.biblioteca.books;


import com.twu.biblioteca.item.Item;

public class Book implements Item {

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

    public String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }

    int getPublicationYear() { return publicationYear; }
}
