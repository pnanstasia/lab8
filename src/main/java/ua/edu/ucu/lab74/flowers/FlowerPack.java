package ua.edu.ucu.lab74.flowers;
import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public void setQuantity(int c_quantity) {
        if (c_quantity < 1) {
            this.quantity = 0;
        }
        else {
            this.quantity = c_quantity;
        }
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }
}
