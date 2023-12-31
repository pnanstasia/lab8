package ua.edu.ucu.lab.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.lab.store.Item;

@Getter @Setter @AllArgsConstructor
@Entity
@NoArgsConstructor
public class Flower extends Item {
    @Id
    private int id;
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public Flower(Flower flower) {
    }

    public String getColor() {
        return color.toString();
    }

    public String getDescription() {
        return "Flowers!:)";
    }
}
