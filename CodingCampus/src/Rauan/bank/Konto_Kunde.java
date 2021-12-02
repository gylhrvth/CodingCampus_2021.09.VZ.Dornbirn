package Rauan.bank;

public class Konto_Kunde {
    private int kundeNr_fk;
    private int kontoNr_fk;
    private String rolle;

    public Konto_Kunde(int kundeNr_fk,int kontoNr_fk, String rolle){
        this.kundeNr_fk=kundeNr_fk;
        this.kontoNr_fk=kontoNr_fk;
        this.rolle=rolle;
    }

    public int getKundeNr_fk() {
        return kundeNr_fk;
    }

    public void setKundeNr_fk(int kundeNr_fk) {
        this.kundeNr_fk = kundeNr_fk;
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
        return "Konto_Kunde{" +
                "kundeNr_fk=" + kundeNr_fk +
                ", kontoNr_fk=" + kontoNr_fk +
                ", rolle='" + rolle + '\'' +
                '}';
    }
}
