package ua.edu.ucu.lab.payment;

public class CreditCartPaymentStrategy implements Payment {

    @Override
    public String pay(double price) {
        return "You chose payment by card";
    }
}
