package Lab7.FlowerContinue.Delivery;

import java.util.List;

// import Lab7.FlowerContinue.Store.FlowerBucket;

// import com.fasterxml.jackson.annotation.JsonProperty;
// import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import Lab7.FlowerContinue.Store.Item;

// @JsonDeserialize(as = PostDeliverStrategy.class)
public class PostDeliverStrategy implements Delivery {

    @Override
    public void deliver(List<Item> items) {
        
    }
    // @JsonProperty(value = "deliveryType")
    // String deliveryType;
    // @Override
    // public void deliver(List<Item> items) {
    //     System.out.println("Delivering via Post");
    //     items.stream().forEach(System.out::println);
    // }

    // @Override
    // public String toString() {
    //     return "PostDeliverStrategy{" +
    //             '}';
    // }
}
