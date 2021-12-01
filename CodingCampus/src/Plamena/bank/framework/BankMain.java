package Plamena.bank.framework;

import Plamena.bank.CRUD;
import Plamena.bank.model.Customer;

import java.util.Date;
import java.sql.SQLException;

public class BankMain {
    public static void main(String[] args) {
        try {
            CRUD crud = new CRUD();
            crud.setUp();
            Customer customer = new Customer("Gyula", "Dornbirn", new Date(2001,10,12));
            //crud.createCustomer(customer);

            crud.deleteCustomer(5);
            //System.out.println("ID: " + customer.getCustomerid());
            System.out.println(crud.queryCustomers(""));


        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
