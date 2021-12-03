package Plamena.bank.framework;

import Plamena.bank.BankManager;
import Plamena.bank.model.Customer;

import java.util.Date;
import java.sql.SQLException;

public class BankMain {
    public static void main(String[] args) {
        try {
            BankManager bankManager = new BankManager();
            bankManager.setUp();
            Customer customer = new Customer("Gyula", "Dornbirn", new Date(2001,10,12));
            //crud.createCustomer(customer);

            bankManager.deleteCustomer(5);
            //System.out.println("ID: " + customer.getCustomerid());
            System.out.println(bankManager.queryCustomers(""));


        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
