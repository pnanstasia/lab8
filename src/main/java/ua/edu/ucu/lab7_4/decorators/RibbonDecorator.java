package ua.edu.ucu.lab7_4.decorators;

import lombok.AllArgsConstructor;
import ua.edu.ucu.lab7_4.store.Item;

@AllArgsConstructor
public class RibbonDecorator implements ItemDecorator {
    private Item item;

    public double getPrice() {
        return (40 + item.getPrice());
    }

    @Override
    public String getDescription() {
        return "Ribbon decorations";
    }
}
