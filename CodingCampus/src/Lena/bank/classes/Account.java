package Lena.bank.classes;

import java.util.ArrayList;
import java.util.List;

public class Account {

    int acountNr;
    String name;
    double balance=0.0;
    List<Customer>customers = new ArrayList<>();

    public Account(int accountNr, String name){
        this.acountNr=accountNr;
        this.name=name;
    }

    public int getAcountNr() {
        return acountNr;
    }

    public void setAcountNr(int acountNr) {
        this.acountNr = acountNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return String.format("KontoNr: %5d   Name: %10s   Kontostand: %20.2f", acountNr,name,balance);

    }
}
