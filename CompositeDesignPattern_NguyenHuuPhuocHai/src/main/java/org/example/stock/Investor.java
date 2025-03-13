package org.example.stock;

import org.example.observer.Observer;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("📩 " + name + " nhận thông báo: " + message);
    }
}
