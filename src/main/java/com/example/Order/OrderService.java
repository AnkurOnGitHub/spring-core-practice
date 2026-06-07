package com.example.Order;

import com.example.Notify.NotifyService;
import com.example.Payment.PaymentService;

public class OrderService {
    private String name;
    private PaymentService paymentService;
    private NotifyService notifyService;
    public OrderService(){}
    public OrderService(String name, PaymentService p, NotifyService n){
        this.notifyService = n;
        this.paymentService = p;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void setNotifyService(NotifyService notifyService) {
        this.notifyService = notifyService;
    }

    public void orderPlaced(){
        paymentService.pay();
        System.out.println("Order has placed by "+name);
        notifyService.sendNotification();
    }
}
