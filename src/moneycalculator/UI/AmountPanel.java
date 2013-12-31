package moneycalculator.UI;

import java.awt.PopupMenu;
import javax.swing.JPanel;
import javax.swing.JTextField;

class AmountPanel extends JPanel {
    
    public AmountPanel() {
        add (createTextField());
    }
    
    private JTextField createTextField(){
        JTextField jTextField = new JTextField(5);
        return jTextField;
    }
    
    
}
