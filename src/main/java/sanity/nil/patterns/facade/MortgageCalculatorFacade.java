package sanity.nil.patterns.facade;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MortgageCalculatorFacade {

    /**
     * Calculates the total price of a mortgage, including interest and agency fees.
     *
     * @param estate The estate being mortgaged.
     * @param agency The estate agency facilitating the transaction.
     * @param bank   The bank providing the mortgage loan.
     * @return The total price of the mortgage.
     */
    public BigDecimal calculateMortgage(Estate estate, EstateAgency agency, Bank bank) {
        BigDecimal estatePrice = estate.getPrice();

        // Calculate agency fee
        BigDecimal agencyFee = estatePrice.multiply(agency.getAgencyFee());

        // Calculate total interest over the loan duration
        BigDecimal mortgageRate = bank.getMortgageRate();
        BigDecimal totalInterest = estatePrice
                .multiply(mortgageRate);

        // Total price = Principal (estate price) + Interest + Agency fee
        return estatePrice
                .add(totalInterest)
                .add(agencyFee)
                .setScale(2, RoundingMode.HALF_UP);
    }
}
