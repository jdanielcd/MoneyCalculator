package moneycalculator;
/*
    Authors:
    Hector Garbisu Arocha.
    David Díaz González.
    Juan Daniel Cabrera Déniz.
    Adrián Mujica González.
*/

import moneycalculator.Persistance.MockCurrencySetLoader;
import moneycalculator.View.ConsoleExchanger;
import moneycalculator.View.SwingExchanger;


public class MoneyCalculator {

    
    public static void main(String[] args) {
        new MockCurrencySetLoader().load();
        new SwingExchanger().execute();
    
    }
}
