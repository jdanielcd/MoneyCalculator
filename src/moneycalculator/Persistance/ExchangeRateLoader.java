package moneycalculator.Persistance;

import moneycalculator.Model.ExchangeRate;
import moneycalculator.Model.Currency;
import java.util.Date;


public interface ExchangeRateLoader {
    public ExchangeRate load(Date date, Currency from, Currency to);
    public ExchangeRate load(Currency from, Currency to);
}
