package org.example;

import java.util.ArrayList;
import java.util.List;

public class Table implements BeverageItem {
    private String tableName;
    private List<BeverageItem> items = new ArrayList<>();

    public Table(String tableName) {
        this.tableName = tableName;
    }

    public void addItem(BeverageItem item) {
        items.add(item);
    }

    @Override
    public double getPrice() {
        return items.stream().mapToDouble(BeverageItem::getPrice).sum();
    }

    @Override
    public void display() {
        System.out.println("🪑 Table: " + tableName);
        for (BeverageItem item : items) {
            item.display();
        }
        System.out.println("💰 Total for " + tableName + ": $" + getPrice() + "\n");
    }
}