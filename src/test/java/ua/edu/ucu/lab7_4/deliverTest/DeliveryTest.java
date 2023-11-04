package ua.edu.ucu.lab7_4.deliverTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.lab7_4.deliverly.DHLDeliverlyStrategy;
import ua.edu.ucu.lab7_4.deliverly.PostDeliveryStrategy;

public class DeliveryTest {
    private PostDeliveryStrategy postDelivery;
    private DHLDeliverlyStrategy DHLdelivery;

    @BeforeEach
    public void init() {
        postDelivery = new PostDeliveryStrategy();
        DHLdelivery = new DHLDeliverlyStrategy(); 
    }

    @Test
    public void testPostDelivery() {
        assertEquals(postDelivery.deliver(null), "You selected post deliverly");
    }

    @Test
    public void testDHLDelivery() {
        assertEquals(DHLdelivery.deliver(null), "DHL deliver, thanks for your choise!");
    }
}

