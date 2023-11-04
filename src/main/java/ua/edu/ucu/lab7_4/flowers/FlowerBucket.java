package ua.edu.ucu.lab7_4.flowers;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.lab7_4.store.Item;

@Getter @Setter
public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks){
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void addFlowerPack(FlowerPack flowerpack) {
        flowerPacks.add(flowerpack);
    }
}
