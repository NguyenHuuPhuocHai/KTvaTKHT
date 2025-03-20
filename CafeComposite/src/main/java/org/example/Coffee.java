package org.example;

public class Coffee implements BeverageItem {
    private String name;
    private double price;

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void display() {
        System.out.println("☕ Coffee: " + name + " | Price: $" + price);
    }
}
