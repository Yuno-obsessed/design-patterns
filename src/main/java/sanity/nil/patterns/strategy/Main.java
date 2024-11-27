package sanity.nil.patterns.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        paymentContext.executePayment(150.75);

        paymentContext.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        paymentContext.executePayment(89.99);

        paymentContext.setPaymentStrategy(new CryptoPayment("1A2b3C4D5E6F7G8H9I0J"));
        paymentContext.executePayment(450.00);
    }
}
