package ua.edu.ucu.lab7_4.decoratorsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.lab7_4.decorators.PaperDecorator;
import ua.edu.ucu.lab7_4.flowers.Flower;

public class PaperTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final int additional = 13;
    private Flower flower;
    private PaperDecorator paperDecorator;
    
    @BeforeEach
    public void init() {
        flower = new Flower();
        paperDecorator = new PaperDecorator(flower);
    }

    @Test
    public void testDescription() {
        assertEquals(paperDecorator.getDescription(), "Decoration with paper");
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price + additional, paperDecorator.getPrice());
    }
}
