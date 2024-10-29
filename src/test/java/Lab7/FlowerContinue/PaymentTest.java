package Lab7.FlowerContinue;

import Lab7.FlowerContinue.Payment.Payment;
import Lab7.FlowerContinue.Payment.CreditCardPaymentStrategy;
import Lab7.FlowerContinue.Payment.PayPalPaymentStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentTest {

    @Test
    public void testCreditCardPaymentStrategyImplementation() {
        Payment creditCardPayment = new CreditCardPaymentStrategy();
        assertTrue(creditCardPayment instanceof CreditCardPaymentStrategy);
        assertDoesNotThrow(() -> creditCardPayment.pay(100.0));
    }

    @Test
    public void testPayPalPaymentStrategyImplementation() {
        Payment payPalPayment = new PayPalPaymentStrategy();
        assertTrue(payPalPayment instanceof PayPalPaymentStrategy);
        assertDoesNotThrow(() -> payPalPayment.pay(100.0));
    }
}
