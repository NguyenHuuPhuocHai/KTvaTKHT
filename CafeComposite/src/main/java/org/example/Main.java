package org.example;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Coffee("Espresso", 3.0);
        Coffee latte = new Coffee("Latte", 4.5);
        Coffee cappuccino = new Coffee("Cappuccino", 5.0);
        Drink orangeJuice = new Drink("Orange Juice", 4.0);
        Drink smoothie = new Drink("Smoothie", 6.0);

        // Tạo các bàn
        Table table1 = new Table("Table 1");
        table1.addItem(espresso);
        table1.addItem(latte);

        Table table2 = new Table("Table 2");
        table2.addItem(cappuccino);
        table2.addItem(orangeJuice);
        table2.addItem(smoothie);

        // Tạo quán cafe
        Cafe cafe = new Cafe("Java Coffee House");
        cafe.addTable(table1);
        cafe.addTable(table2);

        // Hiển thị tổng doanh thu
        cafe.displayRevenue();
    }
}