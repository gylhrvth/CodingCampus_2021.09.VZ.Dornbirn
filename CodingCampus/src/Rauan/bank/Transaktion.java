package Rauan.bank;

public class Transaktion {

    private int fromAccountNr;
    private int toAccountNr;
    private double amount;

    public Transaktion() {
    this.fromAccountNr= fromAccountNr;
    this.toAccountNr= toAccountNr;
    this.amount= amount;
    }

    public int getFromAccountNr() {
        return fromAccountNr;
    }

    public void setFromAccountNr(int fromAccountNr) {
        this.fromAccountNr = fromAccountNr;
    }

    public int getToAccountNr() {
        return toAccountNr;
    }

    public void setToAccountNr(int toAccountNr) {
        this.toAccountNr = toAccountNr;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaktion{" +
                "fromAccountNr=" + fromAccountNr +
                ", toAccountNr=" + toAccountNr +
                ", amount=" + amount +
                '}';
    }
}
