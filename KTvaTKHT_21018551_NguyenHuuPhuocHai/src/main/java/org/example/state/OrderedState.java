package org.example.state;

public class OrderedState implements TableState {
    @Override
    public void handleRequest(Table table) {
        System.out.println("Bàn đã được đặt, khách đang dùng bữa.");
        table.setState(new DoneState());
    }

    @Override
    public String getColor() {
        return "Orange";
    }
}
