package com.example.Notify;

public class Mail implements NotifyService{

    @Override
    public void sendNotification() {
        System.out.println("Send Notification of Order on Mail");
    }
}
