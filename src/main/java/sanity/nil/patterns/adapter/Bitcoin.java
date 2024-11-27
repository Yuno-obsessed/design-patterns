package sanity.nil.patterns.adapter;

import java.math.BigDecimal;

public class Bitcoin {

    private BigDecimal amount;

    public Bitcoin(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
