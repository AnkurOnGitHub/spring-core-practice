package com.example.Payment;

public class UPIPayment implements PaymentService{

    @Override
    public void pay() {
        System.out.println("Paid using UPI");
    }
}
