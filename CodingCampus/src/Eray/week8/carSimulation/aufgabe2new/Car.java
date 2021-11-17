package Eray.week8.carSimulation.aufgabe2new;

public class Car {

    private String hersteller;
    private String model;
    private int kw;
    private double verbrauch;
    private double tankInhalt;
    private ANTRIEBSART antriebsart;
    private int gewicht;
    private String motor;
    private Motor motorDatas;
    private int gefahreneStrecke = 0;
    private int hitPoints = 1000;

    public Car(String hersteller, String model, int kw, double tankInhalt, ANTRIEBSART antriebsart, int gewicht, String motor) {
        this.hersteller = hersteller;
        this.model = model;
        this.kw = kw;
        this.tankInhalt = tankInhalt;
        this.antriebsart = antriebsart;
        this.gewicht = gewicht;
        this.motor = motor;
        this.verbrauch = (kw + gewicht) / 90.00 / 100.00;
    }

    public Car(String hersteller, String model, int kw, ANTRIEBSART antriebsart, int gewicht, String motor) {
        this.hersteller = hersteller;
        this.model = model;
        this.kw = kw;
        this.antriebsart = antriebsart;
        this.gewicht = gewicht;
        this.motor = motor;
    }

    public int getPoints() {
        return hitPoints;
    }

    public int drive(int distanceToTravel) {
        if (this.motorDatas.isTurnedOn()) {
            double verbrauch = distanceToTravel * this.verbrauch;
            if (verbrauch < this.tankInhalt) {
                gefahreneStrecke += distanceToTravel;
                this.tankInhalt -= verbrauch;
                hitPoints -= gefahreneStrecke;
            }else{
                System.out.println("Leider hast du kein Tank mehr");
            }
        }
        return gefahreneStrecke;
    }

    public int getGewicht() {
        return gewicht;
    }

    public Motor getMotorDatas() {
        return motorDatas;
    }

    public void setMotorDatas(Motor motorDatas) {
        this.motorDatas = motorDatas;
    }

    public void setMotorStatus(boolean status){
        this.motorDatas.setIsTurnedOn(status);
    }

    public double getVerbrauch() {
        return verbrauch;
    }

    public void setVerbrauch(double verbrauch) {
        this.verbrauch = verbrauch;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModel() {
        return model;
    }

    public ANTRIEBSART getAntriebsart() {
        return antriebsart;
    }

    public double getTankInhalt() {
        return tankInhalt;
    }

    public int getKw() {
        return kw;
    }

    public String getMotor() {
        return motor;
    }

    public void setTankInhalt(double tankInhalt) {
        this.tankInhalt = tankInhalt;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return "Car{" +
                "  hersteller = " + hersteller +
                "  model = " + model +
                "  kw = " + kw +
                "  tankInhalt = " + tankInhalt +
                "  antriebsart = " + antriebsart +
                "  gewicht = " + gewicht +
                "  motor = " + motor +
                '}';
    }


}
