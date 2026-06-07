package com.example.Payment;

public class CashOnDelivery implements PaymentService{

    @Override
    public void pay() {
        System.out.println("Paid using Cash");
    }
}
