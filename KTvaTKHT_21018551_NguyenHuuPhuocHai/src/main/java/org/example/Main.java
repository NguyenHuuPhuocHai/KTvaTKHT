package org.example;

import org.example.decorator.Employee;
import org.example.decorator.ManagerSalary;
import org.example.factory.Database;
import org.example.factory.DatabaseFactory;
import org.example.singleton.DatabaseConnection;
import org.example.state.*;
import org.example.strategy.CashPayment;
import org.example.strategy.MomoPayment;
import org.example.strategy.Order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n Chọn bài tập:");
            System.out.println("1 - Singleton (Kết nối DB)");
            System.out.println("2 - Factory (Tạo DB)");
            System.out.println("3 - Strategy (Thanh toán)");
            System.out.println("4 - Decorator (Tính lương)");
            System.out.println("5 - State (Trạng thái bàn)");
            System.out.println("0 - Thoát");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1: runSingleton(); break;
                case 2: runFactory(); break;
                case 3: runStrategy(); break;
                case 4: runDecorator(); break;
                case 5: runState(); break;
                case 0:
                    System.out.println(" Thoát chương trình.");
                    return;
                default:
                    System.out.println(" Chọn sai! Vui lòng nhập lại.");
            }
        }
    }

    private static void runSingleton() {
        System.out.println("\n▶ Running Singleton Pattern");
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.connect();
    }

    private static void runFactory() {
        System.out.println("\n▶ Running Factory Pattern");
        Database db = DatabaseFactory.createDatabase("mysql");
        if (db != null) {
            db.connect();
        } else {
            System.out.println(" Database type not supported");
        }
    }

    private static void runStrategy() {
        System.out.println("\n▶ Running Strategy Pattern");
        Order order1 = new Order(new CashPayment());
        order1.processPayment(50000);

        Order order2 = new Order(new MomoPayment());
        order2.processPayment(100000);
    }

    private static void runDecorator() {
        System.out.println("\n▶ Running Decorator Pattern");
        Employee emp = new Employee("Nguyen Van A", 10000000);
        emp.displaySalary();

        Employee manager = new ManagerSalary(emp);
        System.out.println("Sau khi lên Trưởng Phòng:");
        System.out.println("Lương: " + manager.getSalary());
    }

    private static void runState() {
        System.out.println("\n▶ Running State Pattern");
        Table table = new Table();
        TableState[] states = {
                new FreeState(), new OrderedState(), new DoneState(),
                new FreeState(), new FixingState(), new DoneState(), new FreeState()
        };

        for (TableState state : states) {
            table.setState(state);
            System.out.println("Trạng thái hiện tại: " + table.getColor());
            table.handleRequest();
        }
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("\nTrạng thái hiện tại: " + table.getColor());
//            System.out.println("1 - Xử lý trạng thái tiếp theo");
//            System.out.println("2 - Đặt lại trạng thái bàn về Free");
//            System.out.println("0 - Thoát");
//            System.out.print("Nhập lựa chọn của bạn: ");
//
//            int choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    table.handleRequest();
//                    break;
//                case 2:
//                    table.setState(new FreeState());
//                    System.out.println("Bàn đã được đặt lại trạng thái Free.");
//                    break;
//                case 0:
//                    return;
//                default:
//                    System.out.println("Lựa chọn không hợp lệ! Hãy thử lại.");
//            }
//        }
    }

}