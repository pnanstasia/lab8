package ua.edu.ucu.lab7_4.decorators;

import lombok.AllArgsConstructor;
import ua.edu.ucu.lab7_4.store.Item;

@AllArgsConstructor
public class BasketDecorator implements ItemDecorator {
    private Item item;

    public double getPrice() {
        return (4 + item.getPrice());
    }

    @Override
    public String getDescription() {
        return "Decoration with basket";
    }
}
