package org.example.models;

public abstract class Book {
    public String title;
    public String author;
    public String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public abstract void display();
}
