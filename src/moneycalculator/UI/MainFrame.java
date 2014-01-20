package moneycalculator.UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import moneycalculator.Model.Currency;
import moneycalculator.Model.CurrencySet;
import moneycalculator.Model.ExchangeRate;
import moneycalculator.Model.Money;
import moneycalculator.Model.MoneyExchanger;
import moneycalculator.Persistance.ExchangeRateLoader;
import moneycalculator.Persistance.MockExchangeRateLoader;

public class MainFrame extends JFrame {
    private JPanel moneyPanel;
    private CurrencyPanel toCurrencyPanel;
    private AmountPanel amountPanel;
    private CurrencyPanel fromCurrencyPanel;
    
    
    public MainFrame(){
        setTitle("Money Calculator");
        setMinimumSize(new Dimension(450, 450));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createComponents();
        setVisible(true);
    }
    private void createComponents(){
        add(createMainPanel(), BorderLayout.NORTH);
        add(createToolbar(), BorderLayout.SOUTH);
        
    }
    
    private JPanel createMainPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        //panel.add(createMoneyPanel(), BorderLayout.NORTH);
        this.moneyPanel = createMoneyPanel();
        panel.add(moneyPanel, BorderLayout.NORTH);
        //panel.add(createCurrencyPanel(), BorderLayout.NORTH);
        this.toCurrencyPanel = createCurrencyPanel();
        panel.add(toCurrencyPanel, BorderLayout.NORTH);
        return panel;
    }
    
    private JPanel createMoneyPanel() {
        JPanel panel = new JPanel();
        this.amountPanel = new AmountPanel();
        panel.add(amountPanel);
        this.fromCurrencyPanel = new CurrencyPanel();
        panel.add(fromCurrencyPanel);
        //panel.add(new CurrencyPanel());
        return panel;
    }

    private CurrencyPanel createCurrencyPanel() {
        CurrencyPanel panel = new CurrencyPanel();
        //panel.add(new CurrencyPanel());
        return panel;
    }
    
    private JPanel createToolbar(){
        JPanel toolbar = new JPanel();
        toolbar.setLayout(new FlowLayout(FlowLayout.RIGHT));
        toolbar.add(createExchangeButton());
        toolbar.add(exitButton());
        return toolbar;
    }
    private JButton createExchangeButton(){
        JButton button = new JButton("Change Money");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation();
            }
            });
        return button;   
    }
    
    private void operation(){
        MoneyExchanger moneyExchanger = new MoneyExchanger();
        Double amount = Double.parseDouble(amountPanel.getAmount());
        CurrencySet set = CurrencySet.getInstance();
        Currency fromCurrency = set.get(fromCurrencyPanel.getCurrency());
        //System.out.println(fromCurrencyPanel.getCurrency());
        Currency toCurrency = set.get(toCurrencyPanel.getCurrency());
        Money money = new Money(amount,fromCurrency);
        ExchangeRateLoader loader = new MockExchangeRateLoader();
        ExchangeRate rate = loader.load(fromCurrency,toCurrency);
        moneyExchanger.exchange(new Money(amount,fromCurrency), rate);
        System.out.println("Conversion result " + moneyExchanger.getMoney().getAmount() + " "+ moneyExchanger.getMoney().getCurrency().getName());
    }
    
    private JButton exitButton(){
        JButton button = new JButton("Exit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
            });
        return button;   
    }
    
    private void exit(){
        dispose();
    }   
}