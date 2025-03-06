package org.example.strategy;

public class VnPayPayment implements PaymentStrategy{
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via VNPay.");
    }
}
