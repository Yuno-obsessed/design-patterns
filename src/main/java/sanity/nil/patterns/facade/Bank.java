package sanity.nil.patterns.facade;


import java.math.BigDecimal;

public class Bank {

    private String name;
    private BigDecimal mortgagePercent;

    public BigDecimal getMortgageRate() {
        return mortgagePercent.divide(BigDecimal.valueOf(100));
    }

    public Bank(String name, BigDecimal mortgagePercent) {
        this.name = name;
        this.mortgagePercent = mortgagePercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMortgagePercent() {
        return mortgagePercent;
    }

    public void setMortgagePercent(BigDecimal mortgagePercent) {
        this.mortgagePercent = mortgagePercent;
    }
}
