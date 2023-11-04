package ua.edu.ucu.lab.decorators;

import lombok.AllArgsConstructor;
import ua.edu.ucu.lab.store.Item;

@AllArgsConstructor
public class RibbonDecorator implements ItemDecorator {
    private final int add = 40;
    private Item item;

    public double getPrice() {
        return (add + item.getPrice());
    }

    @Override
    public String getDescription() {
        return "Ribbon decorations";
    }
}
