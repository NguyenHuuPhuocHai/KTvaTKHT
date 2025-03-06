package org.example.strategy;

public class Order {
    private final PaymentStrategy paymentStrategy;

    public Order(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount) {
        paymentStrategy.pay(amount);
    }
}
