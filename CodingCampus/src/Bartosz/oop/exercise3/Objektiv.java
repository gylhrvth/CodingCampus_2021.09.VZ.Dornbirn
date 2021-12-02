package Bartosz.oop.exercise3;

public class Objektiv {
    private boolean autoFokus;
    private int filterGewinde;
    private String anschlussTyp;
    private int brennweite;

    public Objektiv(boolean autoFokus, int filterGewinde, String anschlussTyp, int brennweite) {
        this.autoFokus = autoFokus;
        this.filterGewinde = filterGewinde;
        this.anschlussTyp = anschlussTyp;
        this.brennweite = brennweite;
    }

    public boolean isAutoFokus() {
        return autoFokus;
    }
    public void setAutoFokus(boolean autoFokus) {
        this.autoFokus = autoFokus;
    }
    public int getFilterGewinde() {
        return filterGewinde;
    }
    public void setFilterGewinde(int filterGewinde) {
        this.filterGewinde = filterGewinde;
    }
    public String getAnschlussTyp() {
        return anschlussTyp;
    }
    public void setAnschlussTyp(String anschlussTyp) {
        this.anschlussTyp = anschlussTyp;
    }
    public int getBrennweite() {
        return brennweite;
    }
    public void setBrennweite(int brennweite) {
        this.brennweite = brennweite;
    }


}
