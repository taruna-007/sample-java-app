package com.sample;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<String> users = new ArrayList<>();

    // Bug 1 — no null check
    public void createUser(String name) {
        users.add(name.toUpperCase());
        System.out.println("Created user: " + name);
    }

    // Bug 2 — no bounds check
    public String getUser(int index) {
        return users.get(index);
    }

    // Bug 3 — poor search logic
    public boolean userExists(String name) {
        for (String user : users) {
            if (user == name) {  // should use .equals()
                return true;
            }
        }
        return false;
    }

    // Bug 4 — no validation
    public void deleteUser(String name) {
        users.remove(name);
    }
}