package ua.edu.ucu.lab.flowerstoreTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.lab.flowers.Flower;
import ua.edu.ucu.lab.flowers.FlowerBucket;
import ua.edu.ucu.lab.flowers.FlowerPack;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 10;
    private Flower flower;
    private FlowerPack flowerPack;
    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();

        flower = new Flower();

        flowerPack = new FlowerPack(flower, 0);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        flowerPack.setQuantity(quantity);
    }

    @Test
    public void testPrice() {
        Assertions.assertEquals(flowerBucket.getPrice(), 0);
    }
    
    @Test
    public void testAddFlowerPack() {
        List<FlowerPack> flowerPacks = new ArrayList<>();
        flowerPacks.add(flowerPack);
        flowerBucket.addFlowerPack(flowerPack);
        Assertions.assertEquals(flowerBucket.getFlowerPacks(), flowerPacks);
    }
}
