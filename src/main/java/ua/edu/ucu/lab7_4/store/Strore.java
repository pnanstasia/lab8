package ua.edu.ucu.lab7_4.store;

import java.util.ArrayList;
import java.util.List;


public class Strore {
    private List<Item> items;
    public List<Item> search(SearchFilter filter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item: items){
            if (filter.match(item)){
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
