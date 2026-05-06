package com.sample;

public class Order {
    private String id;
    private String status;
    private double amount;

    public Order(String id, String status, double amount) {
        this.id = id;
        this.status = status;
        this.amount = amount;
    }

    public String getId() { return id; }
    public String getStatus() { return status; }
    public double getAmount() { return amount; }
}