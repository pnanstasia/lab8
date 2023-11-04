package ua.edu.ucu.lab.deliverly;
import java.util.List;

import ua.edu.ucu.lab.store.Item;

public interface Delivery {
    String deliver(List<Item> items);
}
