package com.example.Payment;

public class DebitCardPayment implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Paid using DebitCard");
    }
}
