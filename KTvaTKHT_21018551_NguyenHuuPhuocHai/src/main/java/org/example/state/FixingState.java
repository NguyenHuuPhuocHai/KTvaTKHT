package org.example.state;

public class FixingState implements TableState {
    @Override
    public void handleRequest(Table table) {
        System.out.println(" Bàn đang được sửa chữa.");
        table.setState(new DoneState());
    }

    @Override
    public String getColor() {
        return "Red";
    }
}
