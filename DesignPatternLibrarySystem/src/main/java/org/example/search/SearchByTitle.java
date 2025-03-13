package org.example.search;

import org.example.models.Book;

import java.util.List;

public class SearchByTitle implements SearchStrategy{
    @Override
    public void search(List<Book> books, String query) {
        books.stream().filter(book -> book.title.equalsIgnoreCase(query))
                .forEach(Book::display);
    }
}
