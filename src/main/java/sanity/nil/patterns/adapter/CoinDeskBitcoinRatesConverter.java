package sanity.nil.patterns.adapter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CoinDeskBitcoinRatesConverter implements BitcoinRatesConverter {
    @Override
    public Bitcoin getCurrentRate(String currencyCode, BigDecimal amount) {
        BigDecimal bitcoins = null;
        if (currencyCode.equals("USD")) {
            bitcoins = amount.divide(BigDecimal.valueOf(40_000), 10, RoundingMode.UNNECESSARY);
        } else if (currencyCode.equals("EUR")) {
            bitcoins = amount.divide(BigDecimal.valueOf(38_000), 10, RoundingMode.UNNECESSARY);
        }
        return new Bitcoin(bitcoins);
    }
}
