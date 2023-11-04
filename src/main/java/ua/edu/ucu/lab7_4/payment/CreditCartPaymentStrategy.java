package ua.edu.ucu.lab7_4.payment;

public class CreditCartPaymentStrategy implements Payment{

    @Override
    public String pay(double price) {
        return "You chose payment by card";
    }
}
