package moneycalculator.UI;

import java.awt.PopupMenu;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import moneycalculator.Model.Currency;
import moneycalculator.Model.CurrencySet;

class CurrencyPanel extends JPanel {

    public CurrencyPanel() {
        add(createComboBox());
    }
    
    private JComboBox createComboBox(){
        JComboBox comboBox = new JComboBox(getCurrencies());
        return comboBox;
    }
    
    private String [] getCurrencies(){
        ArrayList<String> currencies = new ArrayList<>();
        for(Currency currency: CurrencySet.getInstance()){
            currencies.add(currency.getCode());
        }
        return currencies.toArray(new String[0]);
    }
    
}
