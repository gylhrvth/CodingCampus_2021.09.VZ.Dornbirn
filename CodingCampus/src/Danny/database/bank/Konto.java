package Danny.database.bank;

public class Konto {
    private int kontoNr;
    private double kontoStand;

    private String nameKonto;

    public Konto(String name) {
        this.nameKonto = name;
    }

    public Konto(int kontoNr,double kontoStand,String name) {
        this.kontoNr = kontoNr;
        this.kontoStand = kontoStand;
        this.nameKonto = name;

    }

    public int getKontoNr() {
        return this.kontoNr;
    }

    public void setKontoNr(int kontoNr) {
        this.kontoNr = kontoNr;
    }

    public double getKontoStand() {
        return this.kontoStand;
    }

    public void setKontoStand(double kontoSt) {
        this.kontoStand = kontoSt;
    }

    public String getName() {
        return this.nameKonto;
    }

    public void setName(String name) {
        this.nameKonto = name;
    }


    @Override
    public String toString() {
        return String.format("| KontoNr: %d | KontoTyp: %s | Kontostand: %.2f € |", this.kontoNr, this.nameKonto, this.kontoStand);
    }
}
