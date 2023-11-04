package ua.edu.ucu.lab7_4.store;
import java.util.LinkedList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.lab7_4.deliverly.Delivery;
import ua.edu.ucu.lab7_4.payment.Payment;

@Getter @Setter @AllArgsConstructor
public class Order {
    private Delivery deliver;
    private Payment payment;
    private LinkedList<Item> items;

    public double calculateTotalPrice() {
        double total = 0;
        for(Item all_item:items) {
            total += all_item.getPrice();
        }
        return total;
    }

    public String processOrder() {
        return "Order in process";
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem (Item item) {
        for (Item all_items:items) {
            if (all_items == item) {
                items.remove(item);
            }
        }
    }
}
