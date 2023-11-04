package ua.edu.ucu.lab.payment;

public class PayPalPaymentStrategy implements Payment {

    @Override
    public String pay(double price) {
        return "You choose Pay Pal payment";
    }
}
