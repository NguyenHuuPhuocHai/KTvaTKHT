package org.example;

import org.example.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class CompositeObserver implements Observer {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void receiveNotification(String message) {
        for (Observer observer : observers) {
            observer.receiveNotification(message);
        }
    }
}
