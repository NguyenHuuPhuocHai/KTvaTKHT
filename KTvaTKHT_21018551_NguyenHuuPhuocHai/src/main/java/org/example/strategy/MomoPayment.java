package org.example.strategy;

public class MomoPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via Momo.");
    }
}
