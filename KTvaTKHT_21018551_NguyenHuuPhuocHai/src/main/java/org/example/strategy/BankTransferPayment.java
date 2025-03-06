package org.example.strategy;

public class BankTransferPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via Bank Transfer.");
    }
}
