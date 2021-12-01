package Mahir.sql.model;

public class Konto {
    private long kontoNr;
    private String name;
    private double kontostand;

    public Konto(long kontoNr, String name, double kontostand) {
        this.kontoNr = kontoNr;
        this.name = name;
        this.kontostand = kontostand;
    }


    public long getKontoNr() {
        return kontoNr;
    }

    public void setKontoNr(long kontoNr) {
        this.kontoNr = kontoNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }
}
