package sanity.nil.patterns.adapter;

import java.math.BigDecimal;

public interface BitcoinRatesConverter {

    Bitcoin getCurrentRate(String currencyCode, BigDecimal amount);
}
