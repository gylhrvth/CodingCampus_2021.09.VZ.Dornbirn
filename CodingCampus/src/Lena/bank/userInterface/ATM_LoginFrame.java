package Lena.bank.userInterface;

import Lena.bank.Exceptions.NoCustomerFoundException;
import Lena.bank.classes.Bankomat;

import javax.swing.*;
import java.sql.SQLException;

public class ATM_LoginFrame extends JFrame{
    private JLabel willkommenLabel;
    private JFormattedTextField formattedTextField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JPanel loginPanel;

    private Bankomat atm;


    public ATM_LoginFrame(Bankomat atm) {

        this.setLocation(600,300);
        this.atm=atm;
        setContentPane(loginPanel);

        final int[] customerNr = {0};
        loginButton.addActionListener(e -> {
            char[] input1 = passwordField1.getPassword();
            String inputString = inputToString(input1);
            try {
                 customerNr[0] = Integer.parseInt(inputString);
            }catch (NumberFormatException numberFormatException){
               JOptionPane.showMessageDialog(this, "Das war keine Zahl");
            }
            checkLoginDateInput(customerNr, formattedTextField1.getText());
        });
        this.pack();
        this.setVisible(true);

    }

    private String inputToString(char[] input){
        String inputString="";

        for (int i = 0; i < input.length; i++) {
            inputString+=input[i];
        }
        return inputString;
    }

    public void checkLoginDateInput(int[] customerNrInput, String name){
        try {
            atm.checkLoginDate(customerNrInput[0], name);
            openCustomerFrame(customerNrInput[0]);
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Es ist ein Fehler bei der Verbindung mit dem Server aufgetreten.");
            ex.printStackTrace();
        }catch (NoCustomerFoundException noCustomerFoundException){
            JOptionPane.showMessageDialog(this, noCustomerFoundException.getMessage());
        }
    }

    public void openCustomerFrame(int customerNr) throws SQLException {

        CustomerFrame1 customerFrame= new CustomerFrame1(this.atm, atm.getCustomer(customerNr));
    }

}
