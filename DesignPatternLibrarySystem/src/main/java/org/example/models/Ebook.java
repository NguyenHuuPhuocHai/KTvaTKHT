package org.example.models;

public class Ebook extends Book {
    public Ebook(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void display() {
        System.out.println("📱 Ebook: " + title + " - " + author);
    }
}
