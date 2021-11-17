package Eray.week8.carSimulation.aufgabe2new;

public class Tank extends Car{
    private int battery;
    private double fuelTank;

    public Tank(String hersteller, String model, int kw, double tankInhalt, ANTRIEBSART antriebsart, int gewicht, String motor) {
        super(hersteller, model, kw, tankInhalt, antriebsart, gewicht, motor);
    }

    @Override
    public void setTankInhalt(double tankInhalt) {
        super.setTankInhalt(tankInhalt);
    }


    public int getBattery() {
        return battery;
    }
}
