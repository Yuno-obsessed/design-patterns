package sanity.nil.patterns.adapter;

import java.util.UUID;

public interface BitcoinPaymentEmitter {

    UUID makePayment(Payment payment);
}
