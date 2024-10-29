package Lab7.FlowerContinue;

import Lab7.FlowerContinue.Delivery.Delivery;
import Lab7.FlowerContinue.Delivery.DHLDeliverStrategy;
import Lab7.FlowerContinue.Delivery.PostDeliverStrategy;
import Lab7.FlowerContinue.Store.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeliveryTest {

    private List<Item> items;

    private static class TestItem extends Item {
        @Override
        public double price() {
            return 10.0;
        }
    }

    @BeforeEach
    public void setUp() {
        items = new ArrayList<>();
        items.add(new TestItem());
    }

    @Test
    public void testDHLDeliverStrategyImplementation() {
        Delivery dhlDelivery = new DHLDeliverStrategy();
        assertTrue(dhlDelivery instanceof DHLDeliverStrategy);
        assertDoesNotThrow(() -> dhlDelivery.deliver(items));
    }

    @Test
    public void testPostDeliverStrategyImplementation() {
        Delivery postDelivery = new PostDeliverStrategy();
        assertTrue(postDelivery instanceof PostDeliverStrategy);
        assertDoesNotThrow(() -> postDelivery.deliver(items));
    }
}
