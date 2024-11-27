package sanity.nil.patterns.facade;


import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_HALF_UP;

public class EstateAgency {

    private String name;
    private BigDecimal percent;

    public BigDecimal getAgencyFee() {
        return percent.divide(BigDecimal.valueOf(100), 2, ROUND_HALF_UP);
    }

    public EstateAgency(String name, BigDecimal percent) {
        this.name = name;
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }
}
