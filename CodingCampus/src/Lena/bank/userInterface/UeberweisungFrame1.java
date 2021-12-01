package Lena.bank.userInterface;

import Danny.loop.Pi;
import Lena.bank.Exceptions.BalanceToLowException;
import Lena.bank.Exceptions.NoAccountFoundException;
import Lena.bank.classes.Account;
import Lena.bank.classes.Bankomat;
import Lena.bank.classes.Customer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class UeberweisungFrame1 extends JFrame{
    private JPanel ueberweisungsPanel;
    private JLabel TransaktionsTyp;
    private JTextField fromInput;
    private JTextField toInput;
    private JTextField tamount;
    private JLabel fromAccountNr;
    private JLabel toAccountNr;
    private JLabel amount;
    private JButton zuruecksetzenButton;
    private JButton durchfuehrenButton;
    private JComboBox selectAccountBox;

    private Bankomat atm;
    private Customer customer;

    public UeberweisungFrame1 (Bankomat atm, Customer customer){
        this.setLocation(600,300);
        this.customer=customer;
        this.atm=atm;

        this.setContentPane(ueberweisungsPanel);

        fillComboBox();
        this.selectAccountBox.addActionListener(e -> fromInput.setText(selectAccountBox.getSelectedItem().toString()));

        this.fromInput.setText(this.selectAccountBox.getSelectedItem().toString());
        durchfuehrenButton.addActionListener(e -> executeTransaction());

        this.pack();
        this.setVisible(true);
    }

    private void fillComboBox(){

        for(Account account:customer.getAccounts()){
            this.selectAccountBox.addItem(account);
        }
    }

    private void executeTransaction() {
        Account fromAccount =(Account) selectAccountBox.getSelectedItem();

        try {
            atm.executeTransaction(fromAccount.getAcountNr(), Integer.parseInt(toInput.getText()), Double.parseDouble(tamount.getText()));
            atm.calcBalance(fromAccount.getAcountNr());
            JOptionPane.showMessageDialog(this, "Transaktion wurde erfolgreich durchgeführt");
            this.setVisible(false);
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(this, "Es ist ein Fehler bei der Verbindung aufgetreten. \n Transaktion wurde abgebrochen");
        }catch (BalanceToLowException balanceToLowException){
            JOptionPane.showMessageDialog(this, "Der Kontostand reicht nicht aus. \n Transaktion konnte nicht durchgeführt werden");
        }catch (NoAccountFoundException noAccountFoundException){
            JOptionPane.showMessageDialog(this, "Es konnte kein Empfängerkonto mit dieser Kontonummer gefunden werden.");
        }


    }


}


