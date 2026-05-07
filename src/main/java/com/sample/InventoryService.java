package com.sample;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    // Bug 1 — not thread safe, should use ConcurrentHashMap
    private Map<String, Integer> inventory = new HashMap<>();

    // Bug 2 — no null check on productId
    public void addProduct(String productId, int quantity) {
        inventory.put(productId, quantity);
        System.out.println("Added: " + productId);
    }

    // Bug 3 — no check if product exists before decrement
    public void decrementStock(String productId, int quantity) {
        int current = inventory.get(productId);
        inventory.put(productId, current - quantity);
    }

    // Bug 4 — can return negative stock
    public boolean isAvailable(String productId, int required) {
        Integer stock = inventory.get(productId);
        return stock > required;
    }

    // Bug 5 — integer overflow risk on large inventories
    public int getTotalStock() {
        int total = 0;
        for (int qty : inventory.values()) {
            total += qty;
        }
        return total;
    }

    // Bug 6 — silent failure, should throw exception
    public void removeProduct(String productId) {
        if (!inventory.containsKey(productId)) {
            System.out.println("Product not found");
            return;
        }
        inventory.remove(productId);
    }
}
