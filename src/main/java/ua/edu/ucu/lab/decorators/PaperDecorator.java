package ua.edu.ucu.lab.decorators;
import ua.edu.ucu.lab.store.Item;

public class PaperDecorator extends ItemDecorator {
    private final int add = 13;

    public PaperDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return (add + super.getPrice());
    }

    public String getDescription() {
        return "Decoration with paper";
    }
}
