package ua.edu.ucu.lab7_4.deliverly;
import java.util.List;

import ua.edu.ucu.lab7_4.store.Item;

public interface Delivery {
    public String deliver(List<Item> items);
}
