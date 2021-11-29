package Danny.database.bank;

import java.sql.Timestamp;

public class Transaktion {

    int transaktionsNr;
    int betrag;
    Timestamp zeitstemel;
    int quelleKontoNr;
    int zielKontoNr;

    public Transaktion(int transaktionsNr, int betrag, Timestamp zeitstemel, int quelleKontoNr, int zielKontoNr) {
        this.transaktionsNr = transaktionsNr;
        this.betrag = betrag;
        this.zeitstemel = zeitstemel;
        this.quelleKontoNr = quelleKontoNr;
        this.zielKontoNr = zielKontoNr;
    }

    public int getTransaktionsNr() {
        return transaktionsNr;
    }

    public void setTransaktionsNr(int transaktionsNr) {
        this.transaktionsNr = transaktionsNr;
    }

    public int getBetrag() {
        return betrag;
    }

    public void setBetrag(int betrag) {
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
        return String.format("| TransaktionsNr: %d | Betrag %d | Zeitstempel: %t | QuelleKontoNr: %s | ZielKontoNr: %s" , this.transaktionsNr, this.betrag, this.zeitstemel,this.quelleKontoNr, this.zielKontoNr);
    }

}
