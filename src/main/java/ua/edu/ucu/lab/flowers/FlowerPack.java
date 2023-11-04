package ua.edu.ucu.lab.flowers;
import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public void setQuantity(int cquantity) {
        if (cquantity < 1) {
            this.quantity = 0;
        }
        else {
            this.quantity = cquantity;
        }
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }
}
