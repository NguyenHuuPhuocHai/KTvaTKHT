package org.example.state;

public class DoneState  implements  TableState{
    @Override
    public void handleRequest(Table table) {
        System.out.println("Bàn đã hoàn thành, chuẩn bị dọn dẹp.");
        table.setState(new FreeState());
    }

    @Override
    public String getColor() {
        return "Yellow";
    }
}
