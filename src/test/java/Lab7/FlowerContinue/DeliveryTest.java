package Lab7.FlowerContinue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Lab7.FlowerContinue.Store.Item;
import Lab7.FlowerContinue.Delivery.DHLDeliverStrategy;
import Lab7.FlowerContinue.Delivery.Delivery;
import Lab7.FlowerContinue.Delivery.PostDeliverStrategy;
import Lab7.FlowerContinue.Store.Flower;
import Lab7.FlowerContinue.Store.FlowerColor;

class DeliveryTest {

    private ObjectMapper objectMapper;
    private List<Item> items;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper();

        items = Arrays.asList(
                new Flower(15, FlowerColor.RED, 105),
                new Flower(10, FlowerColor.GREEN, 50)
        );
    }

    @Test
    public void testDHLDeliverStrategyDeserialization() throws JsonProcessingException {
        String dhlJson = "{ \"deliveryType\": \"DHL\" }";

        Delivery delivery = objectMapper.readValue(dhlJson, Delivery.class);

        assertNotNull(delivery);
        assertTrue(delivery instanceof DHLDeliverStrategy);

        delivery.deliver(items);
    }

    @Test
    public void testPostDeliverStrategyDeserialization() throws JsonProcessingException {
        String postJson = "{ \"deliveryType\": \"Post\" }";

        Delivery delivery = objectMapper.readValue(postJson, Delivery.class);

        assertNotNull(delivery);
        assertTrue(delivery instanceof PostDeliverStrategy);

        delivery.deliver(items);
    }
}
