package org.example.state;

public interface TableState {
    void handleRequest(Table table);
    String getColor();
}
