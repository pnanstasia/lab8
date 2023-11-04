package ua.edu.ucu.lab7_4.payment;

public class PayPalPaymentStrategy implements Payment {

    @Override
    public String pay(double price) {
        return "You choose Pay Pal payment";
    }
}
