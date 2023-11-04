package ua.edu.ucu.lab.decorators;

import lombok.AllArgsConstructor;
import ua.edu.ucu.lab.store.Item;

@AllArgsConstructor
public class PaperDecorator implements ItemDecorator {
    private final int add = 13;
    private Item item;

    public double getPrice() {
        return (add + item.getPrice());
    }

    @Override
    public String getDescription() {
        return "Decoration with paper";
    }
}
