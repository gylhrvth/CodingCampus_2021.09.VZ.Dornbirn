package Stefan.Datenbank.BankKonto;

public class Konto_Kunde {
    private int kundenNr_fk;
    private int kontoNr_fk;
    private String rolle;

    public Konto_Kunde(int kundenNr_fk, int kontoNr_fk, String rolle) {
        this.kundenNr_fk = kundenNr_fk;
        this.kontoNr_fk = kontoNr_fk;
        this.rolle = rolle;
    }

    public int getKundenNr_fk() {
        return kundenNr_fk;
    }

    public void setKundenNr_fk(int kundenNr_fk) {
        this.kundenNr_fk = kundenNr_fk;
    }

    public int getKontoNr_fk() {
        return kontoNr_fk;
    }

    public void setKontoNr_fk(int kontoNr_fk) {
        this.kontoNr_fk = kontoNr_fk;
    }

    public String getRolle() {
        return rolle;
    }

    public void setRolle(String rolle) {
        this.rolle = rolle;
    }

    @Override
    public String toString() {
        return "konto_kunde{" +
                "kundenNr_fk=" + kundenNr_fk +
                ", kontoNr_fk=" + kontoNr_fk +
                ", rolle='" + rolle + '\'' +
                '}';
    }
}
