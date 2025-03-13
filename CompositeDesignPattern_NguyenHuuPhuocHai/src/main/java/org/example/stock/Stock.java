package org.example.stock;

import org.example.observer.Observer;


import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String stockName;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setPrice(double newPrice) {
        System.out.println("\n🔔 Giá cổ phiếu " + stockName + " thay đổi từ " + price + " → " + newPrice);
        price = newPrice;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.receiveNotification("🔥 Cổ phiếu " + stockName + " đã thay đổi giá: " + price);
        }
    }
}
