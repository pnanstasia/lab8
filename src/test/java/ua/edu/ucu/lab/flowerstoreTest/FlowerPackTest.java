package ua.edu.ucu.lab.flowerstoreTest;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.lab.flowers.Flower;
import ua.edu.ucu.lab.flowers.FlowerPack;

public class FlowerPackTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 10;
    private static final int MAX_PRICE = 100;
    private Flower flower;
    private FlowerPack flowerPack;

    @BeforeEach
    public void init() {
        flower = new Flower();
        flowerPack = new FlowerPack(flower, 0);
    }


    @Test
    public void testQuantity() {
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        flowerPack.setQuantity(quantity);
        Assertions.assertEquals(quantity, flowerPack.getQuantity());
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price * flowerPack.getQuantity(), 
        flowerPack.getPrice());
    }
}
