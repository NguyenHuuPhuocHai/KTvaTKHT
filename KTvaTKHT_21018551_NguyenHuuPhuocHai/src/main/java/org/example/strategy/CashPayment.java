package org.example.strategy;

public class CashPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " in cash");
    }
}
