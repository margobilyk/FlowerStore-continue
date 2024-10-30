package Lab7.FlowerContinue.Order;

import java.util.LinkedList;

import Lab7.FlowerContinue.Delivery.Delivery;
import Lab7.FlowerContinue.Payment.Payment;
import Lab7.FlowerContinue.Store.Item;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Order(LinkedList<Item> items, Payment payment, Delivery delivery) {
        this.items = items != null ? items : new LinkedList<>();
        this.payment = payment;
        this.delivery = delivery;
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public float calculateTotalPrice() {
        float total = 0;
        for(Item item : items) {
            total += item.price();
        }
        return total;
    }

    public String processOrder(){
        float price = calculateTotalPrice();
        String pay = ((payment==null)? "null":payment.toString());
        String del = ((delivery==null)? "null":delivery.toString());
        return "YourOrder : " + "items : " + items.toString()
                + ", paymentStrategy : " + pay
                + ", deliveryStrategy : " + del
                + ", totalPrice : " + price;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }
}
