package ua.edu.ucu.lab.decorators;
import ua.edu.ucu.lab.store.Item;

public class BasketDecorator extends ItemDecorator {
    private final int add = 4;

    public BasketDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return (add + super.getPrice());
    }

    public String getDescription() {
        return "Decoration with basket";
    }
}
