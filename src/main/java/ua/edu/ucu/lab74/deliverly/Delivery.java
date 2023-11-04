package ua.edu.ucu.lab74.deliverly;
import java.util.List;

import ua.edu.ucu.lab74.store.Item;

public interface Delivery {
    String deliver(List<Item> items);
}
