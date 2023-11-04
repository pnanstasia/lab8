package ua.edu.ucu.lab7_4.decoratorsTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.lab7_4.decorators.BasketDecorator;
import ua.edu.ucu.lab7_4.flowers.Flower;

public class BasketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final int additional = 4;
    private Flower flower;
    private BasketDecorator basketDecorator;
    
    @BeforeEach
    public void init() {
        flower = new Flower();
        basketDecorator = new BasketDecorator(flower);
    }

    @Test
    public void testDescription() {
        assertEquals(basketDecorator.getDescription(), "Decoration with basket");
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price + additional, basketDecorator.getPrice());
    }

}
