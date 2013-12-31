package moneycalculator;

import moneycalculator.Persistance.MockCurrencySetLoader;
import moneycalculator.View.ConsoleExchanger;
import moneycalculator.View.SwingExchanger;


public class MoneyCalculator {

    
    public static void main(String[] args) {
        new MockCurrencySetLoader().load();
        new SwingExchanger().execute();
    
    }
}
