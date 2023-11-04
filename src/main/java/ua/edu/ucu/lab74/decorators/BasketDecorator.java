package ua.edu.ucu.lab74.decorators;

import lombok.AllArgsConstructor;
import ua.edu.ucu.lab74.store.Item;

@AllArgsConstructor
public class BasketDecorator implements ItemDecorator {
    private final int ADD = 4;
    private Item item;

    public double getPrice() {
        return (ADD + item.getPrice());
    }

    @Override
    public String getDescription() {
        return "Decoration with basket";
    }
}
