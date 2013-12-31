package moneycalculator;

import moneycalculator.Persistance.MockCurrencySetLoader;
import moneycalculator.View.ConsoleExchanger;


public class MoneyCalculator {

    
    public static void main(String[] args) {
        new MockCurrencySetLoader().load();
        new ConsoleExchanger().execute();
    
    }
}
