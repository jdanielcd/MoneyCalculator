package moneycalculator.Model;

import moneycalculator.Model.Currency;


public class Money {
    private final double amount;
    private final Currency currency;

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
    
    public Money(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
