package Lab7.FlowerContinue;

import static org.junit.jupiter.api.Assertions.*;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Lab7.FlowerContinue.Payment.CreditCardPaymentStrategy;
import Lab7.FlowerContinue.Payment.PayPalPaymentStrategy;
import Lab7.FlowerContinue.Payment.Payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaymentTest {

    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testCreditCardPaymentStrategyDeserialization() throws JsonProcessingException {
        String creditCardJson = "{ \"paymentType\": \"card\" }";

        Payment payment = objectMapper.readValue(creditCardJson, Payment.class);

        assertNotNull(payment);
        assertTrue(payment instanceof CreditCardPaymentStrategy);

        payment.pay(100.0);
    }

    @Test
    public void testPayPalPaymentStrategyDeserialization() throws JsonProcessingException {
        String payPalJson = "{ \"paymentType\": \"paypal\" }";

        Payment payment = objectMapper.readValue(payPalJson, Payment.class);

        assertNotNull(payment);
        assertTrue(payment instanceof PayPalPaymentStrategy);

        payment.pay(100.0);
    }
}
