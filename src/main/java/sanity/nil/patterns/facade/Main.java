package sanity.nil.patterns.facade;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Estate estate = new Estate("E123", BigDecimal.valueOf(300000)); // $300,000
        EstateAgency agency = new EstateAgency("Dream Estates", BigDecimal.valueOf(2)); // 2% fee
        Bank bank = new Bank("National Bank", BigDecimal.valueOf(5)); // 5% annual interest rate

        // Mortgage calculation
        MortgageCalculatorFacade calculator = new MortgageCalculatorFacade();
        BigDecimal totalMortgage = calculator.calculateMortgage(estate, agency, bank);

        System.out.println("Total Mortgage Price: $" + totalMortgage);
    }
}
