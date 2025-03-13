package org.example.search;

import org.example.models.Book;

import java.util.List;

public interface SearchStrategy {
    void search(List<Book> books, String query);
}
