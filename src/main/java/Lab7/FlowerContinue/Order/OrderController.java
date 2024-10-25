package Lab7.FlowerContinue.Order;

import java.util.Arrays;
import java.util.LinkedList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Lab7.FlowerContinue.Delivery.Delivery;
import Lab7.FlowerContinue.Payment.Payment;
import Lab7.FlowerContinue.Store.Flower;
import Lab7.FlowerContinue.Store.FlowerColor;
import Lab7.FlowerContinue.Store.Item;

@RestController
@RequestMapping
public class OrderController {
    private Order order = new Order(
        new LinkedList<Item>(Arrays.asList(
            new Flower(29, FlowerColor.BLUE, 87),
            new Flower(15, FlowerColor.RED, 105))),
            null,
            null);
    
    @GetMapping(path="api/v1/order/show-order")
    public String processOrder(){
        return order.processOrder();
    }
    @PostMapping(path = "api/v1/order/addItem")
    public void addItem(@RequestBody Item newItem){
        order.addItem(newItem);
    }

    @RequestMapping(value = "/api/v1/order/pay", method = RequestMethod.POST)
    public void choosePayment(@RequestBody Payment payment){
        order.setPaymentStrategy(payment);
    }

    @RequestMapping(value = "/api/v1/order/deliver", method = RequestMethod.POST)
    public void chooseDelivery(@RequestBody Delivery delivery){
        order.setDeliveryStrategy(delivery);
    }
}