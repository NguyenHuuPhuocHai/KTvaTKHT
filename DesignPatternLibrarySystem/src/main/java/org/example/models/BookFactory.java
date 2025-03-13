package org.example.models;

public class BookFactory {
    public static Book createBook(String type, String title, String author, String genre) {
        switch (type.toLowerCase()) {
            case "paper":
                return new PaperBook(title, author, genre);
            case "ebook":
                return new Ebook(title, author, genre);
            case "audiobook":
                return new AudioBook(title, author, genre);
            default:
                throw new IllegalArgumentException("Loại sách không hợp lệ!");
        }
    }
}
