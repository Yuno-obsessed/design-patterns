package sanity.nil.patterns.adapter;

import java.math.BigDecimal;
import java.util.UUID;

public class LegalBitcoinPaymentEmitter implements BitcoinPaymentEmitter {

    @Override
    public UUID makePayment(Payment payment) {
        if (payment.getBitcoin().getAmount().compareTo(BigDecimal.valueOf(0)) == 0) {
            return null;
        }
        return UUID.randomUUID();
    }
}
