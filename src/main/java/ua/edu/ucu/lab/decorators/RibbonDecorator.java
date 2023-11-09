package ua.edu.ucu.lab.decorators;
import ua.edu.ucu.lab.store.Item;

public class RibbonDecorator extends ItemDecorator {
    private final int add = 40;
    private Item item;

    public RibbonDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return (add + super.getPrice());
    }

    public String getDescription() {
        return "Ribbon decorations";
    }
}
