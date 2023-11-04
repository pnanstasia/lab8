package ua.edu.ucu.lab74.decorators;

import lombok.AllArgsConstructor;
import ua.edu.ucu.lab74.store.Item;

@AllArgsConstructor
public class PaperDecorator implements ItemDecorator {
    private final int ADD = 13;
    private Item item;

    public double getPrice() {
        return (ADD + item.getPrice());
    }

    @Override
    public String getDescription() {
        return "Decoration with paper";
    }
}
