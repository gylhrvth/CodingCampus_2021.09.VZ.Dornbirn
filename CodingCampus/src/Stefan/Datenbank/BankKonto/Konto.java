package Stefan.Datenbank.BankKonto;

public class Konto {
    private int kontoNr;
    private double kontostand;
    private String name;

    public Konto(int kontoNr, double kontostand, String name) {
        this.kontoNr = kontoNr;
        this.kontostand = kontostand;
        this.name = name;
    }

    public int getKontoNr() {
        return kontoNr;
    }

    public void setKontoNr(int kontoNr) {
        this.kontoNr = kontoNr;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return String.format("KontoNr: %s\nKontostand: %s\nName: %s \n", getKontoNr(),getKontostand(),getName());

    }
}
