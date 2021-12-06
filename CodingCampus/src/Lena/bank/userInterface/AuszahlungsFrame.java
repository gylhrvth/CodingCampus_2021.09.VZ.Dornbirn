package Lena.bank.userInterface;

import Lena.bank.Exceptions.BalanceToLowException;
import Lena.bank.classes.Account;
import Lena.bank.classes.Bankomat;
import Lena.bank.classes.Customer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class AuszahlungsFrame extends JFrame {

    private JPanel transactionPanel;
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

    public AuszahlungsFrame(Bankomat atm, Customer customer) {
        this.setLocation(600, 300);
        this.customer = customer;
        this.atm = atm;

        this.setContentPane(transactionPanel);
        fillComboBox();

        this.selectAccountBox.addActionListener(e -> fromInput.setText(selectAccountBox.getSelectedItem().toString()));

        this.fromInput.setText(this.selectAccountBox.getSelectedItem().toString());

        durchfuehrenButton.addActionListener(e -> executeAuszahlung());

        this.pack();
        this.setVisible(true);

    }

    private void fillComboBox() {

        for (Account account : customer.getAccounts()) {
            this.selectAccountBox.addItem(account);
        }
    }

    private void executeAuszahlung() {
        Account toAccount = (Account) selectAccountBox.getSelectedItem();

        try {
            atm.executePayout(toAccount.getAcountNr(), Double.parseDouble(tamount.getText()));
            JOptionPane.showMessageDialog(this, "Transaktion wurde erfolgreich durchgeführt");
            this.setVisible(false);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(this, "Es ist ein Fehler bei der Verbindung aufgetreten.\nTransaktion wurde abgebrochen");
        } catch (BalanceToLowException balanceToLowException) {
            JOptionPane.showMessageDialog(this, "Der Kontostand reicht nicht aus.\nTransaktion konnte nicht durchgeführt werden");
        }


    }
}
