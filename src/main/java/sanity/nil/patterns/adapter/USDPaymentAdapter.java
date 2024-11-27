package sanity.nil.patterns.adapter;

import java.math.BigDecimal;
import java.util.UUID;

public class USDPaymentAdapter implements PaymentAdapter {

    private BitcoinPaymentEmitter bitcoinPaymentEmitter;
    private BitcoinRatesConverter bitcoinRatesConverter;

    public USDPaymentAdapter(BitcoinPaymentEmitter bitcoinPaymentEmitter,
                             BitcoinRatesConverter bitcoinRatesConverter) {
        this.bitcoinPaymentEmitter = bitcoinPaymentEmitter;
        this.bitcoinRatesConverter = bitcoinRatesConverter;
    }

    @Override
    public UUID makePayment(String emitter, String receiver, BigDecimal amount) {
        Payment payment = new Payment();
        payment.setEmitter(emitter);
        payment.setReceiver(receiver);
        payment.setBitcoin(bitcoinRatesConverter.getCurrentRate("USD", amount));

        return bitcoinPaymentEmitter.makePayment(payment);
    }
}
