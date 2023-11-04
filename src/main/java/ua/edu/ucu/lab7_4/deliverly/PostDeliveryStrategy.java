package ua.edu.ucu.lab7_4.deliverly;

import java.util.List;
import ua.edu.ucu.lab7_4.store.Item;

public class PostDeliveryStrategy implements Delivery {

    @Override
    public String deliver(List<Item> item) {
        return "You selected post deliverly";
    }
}
