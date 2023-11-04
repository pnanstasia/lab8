package ua.edu.ucu.lab.deliverly;

import java.util.List;

import ua.edu.ucu.lab.store.Item;

public class DHLDeliverlyStrategy implements Delivery {

    @Override
    public String deliver(List<Item> items) {
        return "DHL deliver, thanks for your choise!";
    }
}
