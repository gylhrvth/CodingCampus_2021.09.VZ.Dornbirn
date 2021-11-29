package Danny.database.bank;

public class Konto {
    int kontoNr;
    double kontoSt;
    String name;

    public Konto(int kontoNr, double kontoSt, String name) {
        this.kontoNr = kontoNr;
        this.kontoSt = kontoSt;
        this.name = name;
    }

    public int getKontoNr() {
        return this.kontoNr;
    }

    public void setKontoNr(int kontoNr) {
        this.kontoNr = kontoNr;
    }

    public double getKontoSt() {
        return this.kontoSt;
    }

    public void setKontoSt(double kontoSt) {
        this.kontoSt = kontoSt;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return String.format("| KontoNr: %d | Name %s | Kontostand: %f |", this.kontoNr, this.name, this.kontoSt);
    }
}
