package Plamena.bank.model;

import Plamena.bank.Database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountCustomer {
    private Database database;
    private String accessType;
    private long fkCustomer;
    private long fkAccount;

    public void joinAccountCustomer(Account account, Customer customer) throws SQLException {
        String sql = "INSERT INTO account_customer(fk_customer, fk_account, access_type)" +
                "VALUES (" + customer.getCustomerid()  + ", " + account.getIdaccount() + ", " + account.getDesignation() + ";";
        PreparedStatement statement = database.getConnection().prepareStatement(sql);
        statement.executeUpdate();
    }

    public String isAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public long getFkCustomer() {
        return fkCustomer;
    }

    public void setFkCustomer(long fkCustomer) {
        this.fkCustomer = fkCustomer;
    }

    public long getFkAccount() {
        return fkAccount;
    }

    public void setFkAccount(long fkAccount) {
        this.fkAccount = fkAccount;
    }
}
