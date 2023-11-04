package ua.edu.ucu.lab.delivertest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.lab.deliverly.DHLDeliverlyStrategy;
import ua.edu.ucu.lab.deliverly.PostDeliveryStrategy;

public class DeliveryTest {
    private PostDeliveryStrategy postDelivery;
    private DHLDeliverlyStrategy dHLdelivery;

    @BeforeEach
    public void init() {
        postDelivery = new PostDeliveryStrategy();
        dHLdelivery = new DHLDeliverlyStrategy(); 
    }

    @Test
    public void testPostDelivery() {
        Assertions.assertEquals(postDelivery.deliver(null), 
        "You selected post deliverly");
    }

    @Test
    public void testDHLDelivery() {
        Assertions.assertEquals(dHLdelivery.deliver(null), 
        "DHL deliver, thanks for your choise!");
    }
}

