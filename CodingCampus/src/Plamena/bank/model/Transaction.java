package Plamena.bank.model;

import java.util.Date;

public class Transaction {
    private Account source;
    private Account target;
    private long idTransaction;
    private double amount;
    private Date timestamp;

    public void transactionProcess(){

    }

    public Transaction(Account source, Account target, long idTransaction, double amount, Date timestamp) {
        this.source = source;
        this.target = target;
        this.idTransaction = idTransaction;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public Account getSource() {
        return source;
    }

    public void setSource(Account source) {
        this.source = source;
    }

    public Account getTarget() {
        return target;
    }

    public void setTarget(Account target) {
        this.target = target;
    }

    public long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
