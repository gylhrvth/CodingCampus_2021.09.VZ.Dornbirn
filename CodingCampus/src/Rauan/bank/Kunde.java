package Rauan.bank;

import java.util.Date;

public class Kunde {
    private long kundeNr;
    private String name;
    private String adresse;
    private Date Geburtsdatum;

    public Kunde(long kundeNr, String name, String adresse, Date Geburtsdatum) {
        this.kundeNr = kundeNr;
        this.name = name;
        this.adresse = adresse;
        this.Geburtsdatum = Geburtsdatum;
    }

    public long getKundeNr() {
        return kundeNr;
    }

    public void setKundeNr(long kundeNr) {
        this.kundeNr = kundeNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getGeburtsdatum() {
        return Geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        Geburtsdatum = geburtsdatum;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "kundeNr=" + kundeNr +
                ", name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +
                ", Geburtsdatum=" + Geburtsdatum +
                '}';
    }
}
