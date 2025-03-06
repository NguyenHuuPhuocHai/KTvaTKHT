package org.example.state;

public class Table {
    private TableState state;

    public Table() {
        this.state = new FreeState();
    }

    public void setState(TableState state) {
        this.state = state;
    }

    public void handleRequest() {
        state.handleRequest(this);
    }

    public String getColor() {
        return state.getColor();
    }
}
