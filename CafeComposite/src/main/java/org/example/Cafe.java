package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private String name;
    private List<Table> tables = new ArrayList<>();

    public Cafe(String name) {
        this.name = name;
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public double getTotalRevenue() {
        return tables.stream().mapToDouble(Table::getPrice).sum();
    }

    public void displayRevenue() {
        System.out.println("🏠 Cafe: " + name);
        for (Table table : tables) {
            table.display();
        }
        System.out.println("💵 Total Revenue: $" + getTotalRevenue());
    }
}
