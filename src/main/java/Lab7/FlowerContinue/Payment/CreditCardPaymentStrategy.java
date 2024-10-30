package Lab7.FlowerContinue.Payment;

public class CreditCardPaymentStrategy implements Payment {
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
