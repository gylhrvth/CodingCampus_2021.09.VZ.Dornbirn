package Rauan.woche8.carSimulation2;

public class DataCar {

    private String hersteller;
    private String modell;
    private String antriebsArt;
   private double tankInhalt;
    private int gewicht;
    private int kiloWatt;
    private String motor;

    public DataCar(String hersteller, String modell, String antriebsArt, double tankInhalt,
                   int gewicht, int kiloWatt, String motor) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.antriebsArt = antriebsArt;
        this.tankInhalt = tankInhalt;
        this.gewicht = gewicht;
        this.kiloWatt = kiloWatt;
        this.motor = motor;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModell() {
        return modell;
    }

    public String getAntriebsArt() {
        return antriebsArt;
    }

    public double getTankInhalt() {
        return tankInhalt;
    }

    public int getGewicht() {
        return gewicht;
    }

    public int getKiloWatt() {
        return kiloWatt;
    }

    public String getMotor() {
        return motor;
    }
    public void setTankInhalt() {

        this.tankInhalt = tankInhalt;
    }


    @Override
    public String toString() {
        return "DataCar{" +
                "hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", antriebsArt='" + antriebsArt + '\'' +
                ", tankInhalt=" + tankInhalt +
                ", gewicht=" + gewicht +
                ", kiloWatt=" + kiloWatt +
                ", motor='" + motor + '\'' +
                '}';
    }

    public void setTankInhalt(double v) {
    }
}
