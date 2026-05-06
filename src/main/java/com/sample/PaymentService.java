package com.sample;

public class PaymentService {

    // Bug 8 — no validation on amount
    public boolean processPayment(String userId, double amount) {
        System.out.println("Processing payment for: " + userId);
        return amount > 0;
    }

    // Bug 9 — hardcoded values
    public double applyTax(double amount) {
        return amount + (amount * 18 / 100);
    }

    // Bug 10 — no error handling
    public String generateReceipt(String userId, double amount) {
        return "Receipt for " + userId + ": $" + amount;
    }
}