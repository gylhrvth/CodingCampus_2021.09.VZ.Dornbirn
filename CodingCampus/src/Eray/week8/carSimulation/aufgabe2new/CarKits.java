package Eray.week8.carSimulation.aufgabe2new;

public class CarKits extends Car {
    public CarKits(String hersteller, String model, int kw, double tankInhalt, ANTRIEBSART antriebsart, int gewicht, String motor) {
        super(hersteller, model, kw, tankInhalt, antriebsart, gewicht, motor);
    }

    public CarKits(String hersteller, String model, int kw, ANTRIEBSART antriebsart, int gewicht, String motor) {
        super(hersteller, model, kw, antriebsart, gewicht, motor);
    }

    public void selfRepairingCar() {
        System.out.println("Das Auto wurde erfolgreich repariert !");
        this.setHitPoints(1000);
    }

    public void aeroDynamicCar() {
        System.out.println("Das Auto wurde erfolgreich repariert !");
        System.out.println("Du reduzierst deinen Treibstoffverbrauch um 50%");
        this.setVerbrauch(getVerbrauch() / 2);
    }

    public void crapCar(){
        System.out.println("Das Auto wurde repariert aber es ist anfälliger auf schäden!");
        this.setHitPoints(500);
    }

}
