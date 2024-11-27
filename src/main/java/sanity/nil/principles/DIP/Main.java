package sanity.nil.principles.DIP;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        PaymentService creditCardService = new PaymentService(creditCardProcessor);
        creditCardService.makePayment(150.0);

        System.out.println();

        PaymentProcessor payPalProcessor = new PayPalPaymentProcessor();
        PaymentService payPalService = new PaymentService(payPalProcessor);
        payPalService.makePayment(200.0);

        System.out.println();

        PaymentProcessor cryptoProcessor = new CryptocurrencyPaymentProcessor();
        PaymentService cryptoService = new PaymentService(cryptoProcessor);
        cryptoService.makePayment(300.0);
    }
}
