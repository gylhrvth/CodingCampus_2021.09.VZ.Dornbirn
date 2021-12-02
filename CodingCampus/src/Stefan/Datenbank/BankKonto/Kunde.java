package Stefan.Datenbank.BankKonto;

import java.util.Date;

public class Kunde extends Database {
    private int kundenNr;
    private String name;
    private String adresse;
    private Date geburtsdatum;

    public Kunde(int kundenNr, String name, String adresse, Date geburtsdatum) {
        this.kundenNr = kundenNr;
        this.name = name;
        this.adresse = adresse;
        this.geburtsdatum = geburtsdatum;
    }


    public int getKundenNr() {
        return kundenNr;
    }

    public void setKundenNr(int kundenNr) {
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
        return "KundenNr: " + kundenNr + "\n" +
                "Name: " + name + "\n" +
                "Adresse: " + adresse + "\n" +
                "GebDatum: " + geburtsdatum + "\n";
    }
}
