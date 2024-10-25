package Lab7.FlowerContinue.Payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = CreditCardPaymentStrategy.class)
public class CreditCardPaymentStrategy implements Payment {
    @JsonProperty(value = "paymentType")
    String paymentType;
    @Override
    public void pay(double price) {
        System.out.println("Payment method : Credit Card");
        System.out.println("Grand total : " + price);
    }

    @Override
    public String toString() {
        return "CreditCardPaymentStrategy{}";
    }
}
