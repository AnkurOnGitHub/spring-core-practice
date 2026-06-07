package com.example.Notify;

public class WhatsApp implements NotifyService{

    @Override
    public void sendNotification() {
        System.out.println("Send Notification on WhatsApp...");
    }
}
