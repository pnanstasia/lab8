package ua.edu.ucu.lab7_4.deliverly;

import java.util.List;
import ua.edu.ucu.lab7_4.store.Item;

public class DHLDeliverlyStrategy implements Delivery {

    @Override
    public String deliver(List<Item> items) {
        return "DHL deliver, thanks for your choise!";
    }
}
