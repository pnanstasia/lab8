package ua.edu.ucu.lab.decorators;

import ua.edu.ucu.lab.store.Item;

public class ItemDecorator extends Item {
    private Item item;
    public ItemDecorator(Item item) {
        this.item = item;
    }

    public String getDescription() {
        return item.getDescription();
    }

    public double getPrice() {
        return item.getPrice();
    }
}