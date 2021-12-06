package Danny.database.bank;

import java.sql.Timestamp;

public class Transaktion {

    long transaktionsNr;
    double betrag;
    Timestamp zeitstemel;
    int quelleKontoNr;
    int zielKontoNr;

    public Transaktion(double betrag, int quelleKontoNr, int zielKontoNr) {
        this.betrag = betrag;
        this.zeitstemel = zeitstemel;
        this.quelleKontoNr = quelleKontoNr;
        this.zielKontoNr = zielKontoNr;
    }

    public Transaktion(long transaktionsNr,double betrag,Timestamp zeitstemel, int quelleKontoNr, int zielKontoNr) {
        this.transaktionsNr = transaktionsNr;
        this.betrag = betrag;
        this.zeitstemel = zeitstemel;
        this.quelleKontoNr = quelleKontoNr;
        this.zielKontoNr = zielKontoNr;
    }


    public long getTransaktionsNr() {
        return transaktionsNr;
    }

    public void setTransaktionsNr(long transaktionsNr) {
        this.transaktionsNr = transaktionsNr;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public Timestamp getZeitstemel() {
        return zeitstemel;
    }

    public void setZeitstemel(Timestamp zeitstemel) {
        this.zeitstemel = zeitstemel;
    }

    public int getQuelleKontoNr() {
        return quelleKontoNr;
    }

    public void setQuelleKontoNr(int quelleKontoNr) {
        this.quelleKontoNr = quelleKontoNr;
    }

    public int getZielKontoNr() {
        return zielKontoNr;
    }

    public void setZielKontoNr(int zielKontoNr) {
        this.zielKontoNr = zielKontoNr;
    }

    @Override
    public String toString() {
        return String.format("| TransaktionsNr: %d | Betrag %.2f € | Zeitstempel: %s | QuelleKontoNr: %s | ZielKontoNr: %s" , this.transaktionsNr, this.betrag, this.zeitstemel,this.quelleKontoNr, this.zielKontoNr);
    }

}
