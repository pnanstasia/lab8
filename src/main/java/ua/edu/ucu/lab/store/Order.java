package ua.edu.ucu.lab.store;
import java.util.LinkedList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.lab.deliverly.Delivery;
import ua.edu.ucu.lab.payment.Payment;

@Getter @Setter @AllArgsConstructor
public class Order {
    private Delivery deliver;
    private Payment payment;
    private LinkedList<Item> items;

    public double calculateTotalPrice() {
        double total = 0;
        for (Item allitem:items) {
            total += allitem.getPrice();
        }
        return total;
    }

    public String processOrder() {
        return "Order in process";
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        for (Item allitems:items) {
            if (allitems == item) {
                items.remove(item);
            }
        }
    }
}
