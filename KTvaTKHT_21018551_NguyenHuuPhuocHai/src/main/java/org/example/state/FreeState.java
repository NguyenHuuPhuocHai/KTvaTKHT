package org.example.state;

public class FreeState implements TableState {
    @Override
    public void handleRequest(Table table) {
        System.out.println("Bàn trống, sẵn sàng nhận khách.");
        table.setState(new OrderedState());
    }

    @Override
    public String getColor() {
        return "Green";
    }
}
