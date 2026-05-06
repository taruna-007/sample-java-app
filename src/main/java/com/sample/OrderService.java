package com.sample;

public class OrderService {

    // Bug 5 — integer division loses decimal
    public double calculateDiscount(int price, int percent) {
        return price * percent / 100;
    }

    // Bug 6 — no null check on order
    public String getOrderStatus(Order order) {
        return order.getStatus().toUpperCase();
    }

    // Bug 7 — ignoring exception
    public int parseOrderId(String id) {
        try {
            return Integer.parseInt(id);
        } catch (Exception e) {
            return 0;
        }
    }
}