package org.example.models;

public class PaperBook extends Book {
    public PaperBook(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void display() {
        System.out.println("📖 Sách giấy: " + title + " - " + author);
    }
}
