package org.example;

import org.example.models.Book;
import org.example.models.BookFactory;
import org.example.models.Borrowable;
import org.example.models.ExtendedBorrow;
import org.example.observer.LibraryMember;
import org.example.observer.LibraryNotifier;

public class Main {
    public static void main(String[] args) {
        Library library = Library.getInstance();
        LibraryNotifier notifier = new LibraryNotifier();

        LibraryMember user1 = new LibraryMember("Nguyen Van A");
        notifier.addObserver(user1);

        Book book1 = BookFactory.createBook("paper", "Harry Potter", "J.K. Rowling", "Fantasy");
        library.addBook(book1);
        notifier.notifyObservers("📚 Sách mới: Harry Potter!");

        Borrowable borrowedBook = new ExtendedBorrow(book1);
        borrowedBook.borrow();
        ((ExtendedBorrow) borrowedBook).extend();
    }
}