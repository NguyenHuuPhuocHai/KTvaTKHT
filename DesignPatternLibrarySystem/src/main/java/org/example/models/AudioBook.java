package org.example.models;

public class AudioBook extends Book {
    public AudioBook(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void display() {
        System.out.println("🎧 Sách nói: " + title + " - " + author);
    }
}
