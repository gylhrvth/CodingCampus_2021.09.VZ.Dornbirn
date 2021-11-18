package Eray.week8andweek9.fotoapparat;

public class FotoApparatStativUebung2 {
    private String stativBrennWeite;
    private String stativName;

    public String getStativBrennWeite() {
        return stativBrennWeite;
    }

    public void setStativBrennWeite(String stativBrennWeite) {
        this.stativBrennWeite = stativBrennWeite;

    }

    public String getStativName() {
        return stativName;
    }

    public FotoApparatStativUebung2(String stativBrennWeite, String stativName) {
        this.stativBrennWeite = stativBrennWeite;
        this.stativName = stativName;
    }

    @Override
    public String toString() {
        return "Das Stativ von der Marke " + stativName + " hat eine Brennweite von " + stativBrennWeite + " mm";

    }
}
