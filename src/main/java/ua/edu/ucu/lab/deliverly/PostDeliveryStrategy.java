package ua.edu.ucu.lab.deliverly;

import java.util.List;

import ua.edu.ucu.lab.store.Item;

public class PostDeliveryStrategy implements Delivery {

    @Override
    public String deliver(List<Item> item) {
        return "You selected post deliverly";
    }
}
