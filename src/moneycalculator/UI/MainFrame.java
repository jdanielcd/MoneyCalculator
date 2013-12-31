package moneycalculator.UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
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
        panel.add(createMoneyPanel(), BorderLayout.NORTH);
        panel.add(createCurrencyPanel(), BorderLayout.NORTH);
        return panel;
    }
    
    private JPanel createMoneyPanel() {
        JPanel panel = new JPanel();
        panel.add(new AmountPanel());
        panel.add(new CurrencyPanel());
        return panel;
    }

    private JPanel createCurrencyPanel() {
        JPanel panel = new JPanel();
        panel.add(new CurrencyPanel());
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
        
        System.out.println("HolaQUehace");
        
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