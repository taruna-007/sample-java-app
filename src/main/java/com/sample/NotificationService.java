package com.sample;

public class NotificationService {

    public void sendEmail(String email, String message) {
        // Bug: no email validation
        System.out.println("Sending to: " + email);
    }

    public void sendSms(String phone, String message) {
        // Bug: no null check
        System.out.println(phone.trim() + ": " + message);
    }
}
