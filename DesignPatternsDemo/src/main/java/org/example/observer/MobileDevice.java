package org.example.observer;

public class MobileDevice implements Observer {
    private String name;

    public MobileDevice(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " nhận thông báo: " + message);
    }
}
