package Eray.bank;

import java.util.Date;

public class Kunde {
    private long kundenNr;
    private String name;
    private String adresse;
    private Date geburtsdatum;

    public Kunde(long kundenNr, String name, String adresse, Date geburtsdatum) {
        this.kundenNr = kundenNr;
        this.name = name;
        this.adresse = adresse;
        this.geburtsdatum = geburtsdatum;
    }

    public long getKundenNr() {
        return kundenNr;
    }

    public void setKundenNr(long kundenNr) {
        this.kundenNr = kundenNr;
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
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "kundenNr=" + kundenNr +
                ", name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +
                ", geburtsdatum=" + geburtsdatum +
                '}';
    }
}
