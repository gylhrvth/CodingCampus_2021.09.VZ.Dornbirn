package Eray.week8andweek9.carSimulation.aufgabe2;

public class CarDatasAufgabe2 {
    private String hersteller;
    private String modell;
    private double tankInhalt;
    private String antriebsArt;
    private int gewicht;
    private int kiloWatt;
    private String motor;


    public CarDatasAufgabe2(String hersteller, String modell, String antriebsArt, String motor, int gewicht, double tankInhalt, int kiloWatt) {

        this.hersteller = hersteller;
        this.modell = modell;
        this.antriebsArt = antriebsArt;
        this.motor = motor;
        this.gewicht = gewicht;
        this.tankInhalt = tankInhalt;
        this.kiloWatt = kiloWatt;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getMotor() {
        return motor;
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
                "Motor = " + motor + '\n' +
                "TankInhalt = " + tankInhalt + " Liter\n" +
                "AntriebsArt = " + antriebsArt + '\n' +
                "Gewicht = " + gewicht + " KG\n" +
                "KiloWatt = " + kiloWatt + " \n" +
                "PS = " + (kiloWatt * 1.35962) + " PS \n";
    }
}
