package org.example.search;

import org.example.models.Book;

import java.util.List;

public class SearchByAuthor implements SearchStrategy{
    @Override
    public void search(List<Book> books, String query) {
        books.stream().filter(book -> book.author.equalsIgnoreCase(query))
                .forEach(Book::display);
    }
}
