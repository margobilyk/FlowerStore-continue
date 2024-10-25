package Lab7.FlowerContinue.Delivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import Lab7.FlowerContinue.Store.Item;

import java.util.List;

@JsonDeserialize(as = DHLDeliverStrategy.class)
public class DHLDeliverStrategy implements Delivery {

    @JsonProperty(value = "deliveryType")
    String deliveryType;
    @Override
    public void deliver(List<Item> items) {
        System.out.println("Don't forget to receive your DHL delivery");
        System.out.println("Content of the package:");
        items.stream().forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "DHLDeliverStrategy{" +
                '}';
    }
}
