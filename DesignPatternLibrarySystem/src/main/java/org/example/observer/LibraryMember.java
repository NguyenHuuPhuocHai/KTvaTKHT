package org.example.observer;

public class LibraryMember implements Observer {
    private String name;

    public LibraryMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("📩 " + name + " nhận thông báo: " + message);
    }
}
