package ua.edu.ucu.lab74.decoratorsTest;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.lab74.decorators.BasketDecorator;
import ua.edu.ucu.lab74.flowers.Flower;

public class BasketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final int Additional = 4;
    private Flower flower;
    private BasketDecorator basketDecorator;
    
    @BeforeEach
    public void init() {
        flower = new Flower();
        basketDecorator = new BasketDecorator(flower);
    }

    @Test
    public void testDescription() {
        Assertions.assertEquals(basketDecorator.getDescription(),
         "Decoration with basket");
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price + Additional, basketDecorator.getPrice());
    }

}
