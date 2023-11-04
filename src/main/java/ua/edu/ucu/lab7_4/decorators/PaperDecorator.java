package ua.edu.ucu.lab7_4.decorators;

import lombok.AllArgsConstructor;
import ua.edu.ucu.lab7_4.store.Item;

@AllArgsConstructor
public class PaperDecorator implements ItemDecorator {
    private Item item;

    public double getPrice() {
        return (13 + item.getPrice());
    }

    @Override
    public String getDescription() {
        return "Decoration with paper";
    }
}
