package Eray.week8.carSimulation.aufgabe2;

public class Tank extends CarDatasAufgabe2 {


    private double tankVerbrauch = 14.00;


    public Tank(String hersteller, String modell, String antriebsArt, String motor, int gewicht, double tankInhalt, int kiloWatt) {
        super(hersteller, modell, antriebsArt, motor, gewicht, tankInhalt, kiloWatt);
    }

    public double getTankVerbrauch() {
        return tankVerbrauch;
    }


    public void setTankVerbrauch(double tankVerbrauch) {
        this.tankVerbrauch = tankVerbrauch;
    }
}
