package Ingo.week9.Camera;

import org.w3c.dom.ls.LSOutput;

public class Camera {
    private String hersteller;
    private String model;
    private int megapixel;
    private int objektiv;
    private double speicherplatz;

    Camera(String hersteller, String model, int megapixel, int objektiv, double speicherplatz) {
        this.hersteller = hersteller;
        this.model = model;
        this.megapixel = megapixel;
        this.objektiv = objektiv;
        this.speicherplatz = speicherplatz;

    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
    }

    public int getObjektiv() {
        return objektiv;
    }

    public void setObjektiv(int objektiv) {
        this.objektiv = objektiv;
    }

    public double getSpeicherplatz() {
        return speicherplatz;
    }

    public void setSpeicherplatz(double speicherplatz) {
        this.speicherplatz = speicherplatz;
    }

    @Override
    public String toString() {
        return String.format("\nhersteller: %s \nmodel: %s \nmegapixel: %d \nobjektiv: %d \nspeicherplatz: %.2f", hersteller, model, megapixel,
                objektiv, speicherplatz);
    }

    void menue() {
        System.out.println("Drücken Sie 1 für neues Foto !");
        System.out.println("Drücken Sie 2 für Camera beenden !");
    }

    void takeFoto() {
        System.out.println("───▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄───");
        System.out.println("───█▒▒░░░░░░░░░▒▒█───");
        System.out.println("────█░░█░░░░░█░░█────");
        System.out.println("─▄▄──█░░░▀█▀░░░█──▄▄─");
        System.out.println("█░░█─▀▄░░░░░░░▄▀─█░░█");
    }

    void closeCamera() {
        System.out.println("Das Programm wir beendet!");
    }

    void repeatInput() {

    }
}

