package moneycalculator;

public class MoneyExchanger {
    public static Money exchange(Money money, ExchangeRate rate){
        return new Money(money.getAmount() * rate.getRate(), rate.getTo());
    }
}
