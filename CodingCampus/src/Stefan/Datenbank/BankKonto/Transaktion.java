package Stefan.Datenbank.BankKonto;

import java.util.Date;

public class Transaktion {
    private int transaktionsNr;
    private double betrag;
    private Date zeitstempel;
    private int quelle_kontoNr_fk;
    private int ziel_kontoNr_fk;

    public Transaktion(int transaktionsNr, double betrag, Date zeitstempel, int quelle_kontoNr_fk, int ziel_kontoNr_fk) {
        this.transaktionsNr = transaktionsNr;
        this.betrag = betrag;
        this.zeitstempel = zeitstempel;
        this.quelle_kontoNr_fk = quelle_kontoNr_fk;
        this.ziel_kontoNr_fk = ziel_kontoNr_fk;
    }

    public int getTransaktionsNr() {
        return transaktionsNr;
    }

    public void setTransaktionsNr(int transaktionsNr) {
        this.transaktionsNr = transaktionsNr;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public Date getZeitstempel() {
        return zeitstempel;
    }

    public void setZeitstempel(Date zeitstempel) {
        this.zeitstempel = zeitstempel;
    }

    public int getQuelle_kontoNr_fk() {
        return quelle_kontoNr_fk;
    }

    public void setQuelle_kontoNr_fk(int quelle_kontoNr_fk) {
        this.quelle_kontoNr_fk = quelle_kontoNr_fk;
    }

    public int getZiel_kontoNr_fk() {
        return ziel_kontoNr_fk;
    }

    public void setZiel_kontoNr_fk(int ziel_kontoNr_fk) {
        this.ziel_kontoNr_fk = ziel_kontoNr_fk;
    }

    @Override
    public String toString() {
        return "Transaktion{" +
                "transaktionsNr=" + transaktionsNr +
                ", betrag=" + betrag +
                ", zeitstempel=" + zeitstempel +
                ", quelle_kontoNr_fk=" + quelle_kontoNr_fk +
                ", ziel_kontoNr_fk=" + ziel_kontoNr_fk +
                '}';
    }
}
