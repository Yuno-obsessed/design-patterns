package sanity.nil.patterns.adapter;

import java.math.BigDecimal;
import java.util.UUID;

public interface PaymentAdapter {

    UUID makePayment(String emitter, String receiver, BigDecimal amount);
}
