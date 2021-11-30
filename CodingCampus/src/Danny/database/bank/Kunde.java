package Danny.database.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Kunde {
    private int kundenNr;
    private String name;
    private String adresse;
    private String gebDatum;
    private Date gebDatumDate;

    public Kunde(String name, String adresse, String gebDatum) throws ParseException {
        this.name = name;
        this.adresse = adresse;
        this.gebDatumDate = new SimpleDateFormat("dd/MM/yyyy").parse(gebDatum);
    }

    public Kunde(int kundenNr,String name, String adresse, Date gebDatumDate) throws ParseException {
        this.kundenNr = kundenNr;
        this.name = name;
        this.adresse = adresse;
        this.gebDatumDate = gebDatumDate;
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

    public String getGebDatum() {
        return gebDatum;
    }

    public void setGebDatum(String gebDatum) {
        this.gebDatum = gebDatum;
    }

    public Date getGebDatumDate() {
        return gebDatumDate;
    }

    public void setGebDatumDate(Date gebDatumDate) {
        this.gebDatumDate = gebDatumDate;
    }

    @Override
    public String toString() {
        return String.format("| KundenNr: %3d | Name: %-18s | Adresse: %-13s | Geburtsdatum: %s |", this.kundenNr, this.name, this.adresse, getGebDatumDate());
    }


}
