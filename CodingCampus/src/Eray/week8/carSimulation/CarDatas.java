package Eray.week8.carSimulation;

public class CarDatas {
    private String hersteller;
    private String modell;
    private double tankInhalt;
    private String antriebsArt;
    private int gewicht;
    private int kiloWatt;

    public CarDatas(String hersteller, String modell, String antriebsArt, int gewicht, double tankInhalt, int kiloWatt) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.antriebsArt = antriebsArt;
        this.gewicht = gewicht;
        this.tankInhalt = tankInhalt;
        this.kiloWatt = kiloWatt;
    }

    public String getHersteller() {
        return hersteller;
    }

    public int getGewicht() {
        return gewicht;
    }

    public int getKiloWatt() {
        return kiloWatt;
    }

    public double getTankInhalt() {
        return tankInhalt;
    }

    public String getAntriebsArt() {
        return antriebsArt;
    }

    public String getModell() {
        return modell;
    }

    public void setTankInhalt(double tankInhalt) {
        this.tankInhalt = tankInhalt;
    }

    @Override
    public String toString() {

        return "Alle Auto Daten: " +
                "Hersteller = " + hersteller + '\n' +
                "Modell = " + modell + '\n' +
                "TankInhalt = " + tankInhalt + " Liter\n" +
                "AntriebsArt = " + antriebsArt + '\n' +
                "Gewicht = " + gewicht + " KG\n" +
                "KiloWatt = " + kiloWatt;
    }
}
