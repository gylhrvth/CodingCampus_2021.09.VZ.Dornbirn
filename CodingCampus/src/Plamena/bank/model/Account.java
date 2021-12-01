package Plamena.bank.model;

import Plamena.bank.Database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Account {
    private Database database;
    private long idaccount;
    private double balance;
    private String designation;

    public Account(long idaccount, double balance, String designation) {
        this.idaccount = idaccount;
        this.balance = balance;
        this.designation = designation;
    }

    public void createAccount(Account account) throws SQLException {
        String sql = "INSERT INTO accounts(balance, designation) VALUES(" + account.getBalance() + ", " + account.getDesignation() + ";";
        PreparedStatement statement = database.getConnection().prepareStatement(sql);
        statement.executeUpdate();
    };

    public long getIdaccount() {
        return idaccount;
    }

    public void setIdaccount(long idaccount) {
        this.idaccount = idaccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
