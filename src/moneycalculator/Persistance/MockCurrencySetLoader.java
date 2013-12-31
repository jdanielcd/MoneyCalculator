package moneycalculator.Persistance;

import moneycalculator.Model.CurrencySet;
import moneycalculator.Model.Currency;


public class MockCurrencySetLoader implements CurrencySetLoader{

    @Override
    public CurrencySet load() {
        CurrencySet currencySet = CurrencySet.getInstance();
        currencySet.add(new Currency("EUR", "Euro", "€"));
        currencySet.add(new Currency("USD", "US Dollar", "$"));
        currencySet.add(new Currency("GBP", "Pound Sterling", "£"));
        return currencySet;
    }
    
}
