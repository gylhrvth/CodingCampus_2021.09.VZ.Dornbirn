package Rauan.bank;

public class Konto {
    private long kontoNr;
    private double balance;
    private String designaton;

    public Konto(long kontoNr, double balance,String designaton){
        this.kontoNr=kontoNr;
        this.balance=balance;
        this.designaton=designaton;

    }

    public long getKontoNr() {
        return kontoNr;
    }

    public void setKontoNr(long kontoNr) {
        this.kontoNr = kontoNr;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDesignaton() {
        return designaton;
    }

    public void setDesignaton(String designaton) {
        this.designaton = designaton;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "kontoNr=" + kontoNr +
                ", balance=" + balance +
                ", designaton='" + designaton + '\'' +
                '}';
    }
}
