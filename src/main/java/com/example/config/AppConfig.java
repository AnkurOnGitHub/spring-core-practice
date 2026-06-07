package com.example.config;

import com.example.Notify.Mail;
import com.example.Notify.NotifyService;
import com.example.Notify.WhatsApp;
import com.example.Order.OrderService;
import com.example.Payment.CashOnDelivery;
import com.example.Payment.DebitCardPayment;
import com.example.Payment.PaymentService;
import com.example.Payment.UPIPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.OptionalDouble;

@Configuration
public class AppConfig {
    @Bean
    public OrderService orderService(@Qualifier("cashOnDelivery") PaymentService p, @Qualifier("mail") NotifyService n){
        OrderService orderService = new OrderService();
        orderService.setName("Toshi");
        orderService.setNotifyService(n);
        orderService.setPaymentService(p);
        return orderService;
    }

    @Bean
    public DebitCardPayment paymentService(){
        return new DebitCardPayment();
    }

    @Bean
    public UPIPayment upiPayment(){
        return new UPIPayment();
    }

    @Bean
    public CashOnDelivery cashOnDelivery(){
        return new CashOnDelivery();
    }


    @Bean
    public WhatsApp whatsApp(){
        return new WhatsApp();
    }

    @Bean
    public Mail mail(){
        return new Mail();
    }





}
