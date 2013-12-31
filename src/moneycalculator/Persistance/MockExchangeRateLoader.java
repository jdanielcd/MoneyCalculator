package moneycalculator.Persistance;

import moneycalculator.Model.ExchangeRate;
import moneycalculator.Model.Currency;
import java.util.Date;

public class MockExchangeRateLoader implements ExchangeRateLoader{

    @Override
    public ExchangeRate load(Date date, Currency from, Currency to) {
        return new ExchangeRate(date,from,to,1.4);
    }

    @Override
    public ExchangeRate load(Currency from, Currency to) {
        return new ExchangeRate(new Date(),from,to,1.4);
    }
    
}
