package Rauan.woche8.Car;

public class CarKlasse {
    private String hersteller;
    private String modell;
    private double tankinhalt;
    private String antriebsart;
    private int gewicht;
    private int kilowatt;

    public CarKlasse(String hersteller, String modell, double tankinhalt, String antriebsart, int gewicht, int kilowatt) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.tankinhalt = tankinhalt;
        this.antriebsart = antriebsart;
        this.gewicht = gewicht;
        this.kilowatt = kilowatt;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModell() {
        return modell;
    }

    public double getTankinhalt() {
        return tankinhalt;
    }

    public String getAntriebsart() {
        return antriebsart;
    }

    public int getGewicht() {
        return gewicht;
    }

    public int getKilowatt() {
        return kilowatt;
    }

    public void setTankinhalt(double tankinhalt) {
        this.tankinhalt = tankinhalt;
    }

    @Override
    public String toString() {
        return String.format("Herstellr: " + hersteller + '\n' +
                            "Modell: " + modell + '\n' +
                            "TankInhalt: " + tankinhalt + "Liter\n" +
                           "AntriebsArt: " + antriebsart + '\n' +
                           "Gewicht :" + gewicht + "KG\n" +
                           "KilloWatt: " + kilowatt + '\n');
    }
}
