package Lena.bank.userInterface;

import Lena.bank.Exceptions.BalanceToLowException;
import Lena.bank.classes.Account;
import Lena.bank.classes.Bankomat;
import Lena.bank.classes.Customer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class EinzahlungsFrame extends JFrame{

    private JPanel einzahlungsPanel;
    private JLabel TransaktionsTyp;
    private JTextField fromInput;
    private JTextField tamount;
    private JLabel fromAccountNr;
    private JLabel amount;
    private JButton zuruecksetzenButton;
    private JButton durchfuehrenButton;
    private JComboBox<Account> selectAccountBox;

    private Bankomat atm;
    private Customer customer;

    public EinzahlungsFrame(Bankomat atm, Customer customer){

        this.setLocation(600,300);
        this.customer=customer;
        this.atm=atm;

        this.setContentPane(einzahlungsPanel);

        fillComboBox();
        this.selectAccountBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fromInput.setText(selectAccountBox.getSelectedItem().toString());
            }
        });

        this.fromInput.setText(this.selectAccountBox.getSelectedItem().toString());

        durchfuehrenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeEinzahlung();
            }
        });

        this.pack();
        this.setVisible(true);
    }

    private void fillComboBox(){

        for(Account account:customer.getAccounts()){
            this.selectAccountBox.addItem(account);
        }
    }

    private void executeEinzahlung() {
        Account toAccount =(Account) selectAccountBox.getSelectedItem();

        try {
            atm.executeDisposition(toAccount.getAcountNr(), Double.parseDouble(tamount.getText()));
            atm.calcBalance(toAccount.getAcountNr());
            JOptionPane.showMessageDialog(this, "Transaktion wurde erfolgreich durchgeführt");
            this.setVisible(false);
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(this, "Es ist ein Fehler bei der Verbindung aufgetreten. \n Transaktion wurde abgebrochen");
        }


    }
}
