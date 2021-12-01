package Lena.bank.userInterface;

import Lena.bank.classes.Bankomat;
import Lena.bank.classes.Customer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerFrame1 extends JFrame {
    private JPanel customerPanel;
    private JLabel CustomerNr;
    private JLabel CustomerName;
    private JLabel CustomerCirthday;
    private JLabel CustomerAdress;
    private JList AccountList;
    private JButton einzahlungButton;
    private JButton ueberweisungButton;
    private JButton auszahlungButton;
    private JButton button4;

    private Bankomat atm;
    private Customer customer;

    public CustomerFrame1(Bankomat atm, Customer customer) {
        this.setLocation(600, 300);
        this.customer = customer;
        this.atm = atm;

        this.setContentPane(customerPanel);

        this.CustomerNr.setText(this.customer.getKundenNr() + "");
        this.CustomerName.setText(this.customer.getName());
        this.CustomerCirthday.setText(this.customer.getBirthday().toString());
        this.CustomerAdress.setText(this.customer.getAdress());

        this.AccountList.setListData(this.customer.getAccounts().toArray());

        einzahlungButton.addActionListener(e -> {
            EinzahlungsFrame einzahlungsFrame = new EinzahlungsFrame(atm, customer);
        });

        auszahlungButton.addActionListener(e -> {
            AuszahlungsFrame auszahlungsFrame = new AuszahlungsFrame(atm, customer);
        });

        ueberweisungButton.addActionListener(e -> {
            UeberweisungFrame1 ueberweisungFrame1 = new UeberweisungFrame1(atm,customer);
        });




        this.pack();
        this.setVisible(true);

    }


}
