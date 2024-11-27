package sanity.nil.patterns.adapter;

import java.math.BigDecimal;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        String paymentEmitter = "John Smith";
        BigDecimal dollars = new BigDecimal(150_000);
        String paymentReceiver = "John Doe";
        USDPaymentAdapter paymentAdapter = new USDPaymentAdapter(new LegalBitcoinPaymentEmitter(),
                new CoinDeskBitcoinRatesConverter());
        UUID paymentID = paymentAdapter.makePayment(paymentEmitter, paymentReceiver, dollars);
        System.out.println("Payment ID: " + paymentID);
    }
}
