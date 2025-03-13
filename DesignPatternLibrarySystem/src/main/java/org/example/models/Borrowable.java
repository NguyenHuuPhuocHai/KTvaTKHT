package org.example.models;

public class Borrowable     {
    public Book book;

    public Borrowable(Book book) {
        this.book = book;
    }

    public void borrow() {
        System.out.println("📚 " + book.title + " đã được mượn!");
    }
}
