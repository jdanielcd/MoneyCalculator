package moneycalculator.Persistance;

import java.util.ArrayList;
import java.util.Date;
import moneycalculator.Model.Currency;
import moneycalculator.Model.CurrencySet;
import moneycalculator.Model.ExchangeRate;

public class MockExchangeRateLoader implements ExchangeRateLoader{

@Override
    public ExchangeRate load(Currency from, Currency to) {
    ArrayList<ExchangeRate> exchangeList = new ArrayList<>();
    CurrencySet set = CurrencySet.getInstance();
    Currency fromCurrency = set.get("EUR");
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("EUR"), 1.0000));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("USD"), 1.3587));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("JPY"), 142.67 ));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("BGN"), 1.9558 ));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("CZK"), 27.392 ));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("DKK"),  7.4621 ));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("GBP"),  0.82800));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("HUF"), 299.24 ));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("LTL"), 3.4528 ));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("PLN"), 4.1749));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("RON"), 4.5450 ));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("SEK"), 8.8820));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("CHF"), 1.2342 ));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("NOK"), 8.4025));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("HRK"), 7.6290));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("RUB"), 45.1468));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("TRY"), 2.9585));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("AUD"), 1.5265));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("BRL"), 3.2511));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("CAD"), 1.4777));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("CNY"), 8.2230));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("HKD"), 10.5367));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("IDR"), 16325.80));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("ILS"), 4.7506));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("INR"), 84.1100));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("KRW"), 1443.48));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("MXN"), 17.7718));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("MYR"), 4.4423));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("NZD"), 1.6527));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("PHP"), 60.746));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("SGD"), 1.7255));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("THB"), 44.929));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("SGD"), 14.6297));
    exchangeList.add(new ExchangeRate(fromCurrency, set.get("ZAR"), 13.4777));
    double rate = 1.;
    for (ExchangeRate exchangeRate : exchangeList) {
       
        if(exchangeRate.getTo().getCode().equals(null)){
            System.out.println("ierda pa ti");
            continue;
        }
        if(exchangeRate.getTo().getCode().equals(to.getCode())){
            System.out.println("ToCurrency encontrado");
            rate *= exchangeRate.getRate();
            break;
        }
        else System.out.println("Buscando...");
    }
    for (ExchangeRate exchangeRate : exchangeList) {
       
        if(exchangeRate.getTo().getCode().equals(null)){
            System.out.println("ierda pa ti");
            continue;
        }
        if(exchangeRate.getTo().getCode().equals(from.getCode())){
            System.out.println("ToCurrency encontrado");
            rate /= exchangeRate.getRate();
            break;
        }
        else System.out.println("Buscando2...");
    }
    
    return new ExchangeRate (from,to,rate);
    
    }

    @Override
    public ExchangeRate load(Date date, Currency from, Currency to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
