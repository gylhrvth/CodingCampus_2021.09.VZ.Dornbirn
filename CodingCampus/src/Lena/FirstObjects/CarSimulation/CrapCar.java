package Lena.FirstObjects.CarSimulation;

public class CrapCar extends Car{
    public CrapCar(String manufacturer, String model, Fuel fuel, double weight, Tank tank) {
        super(manufacturer, model, fuel, weight, new CrapEngine(70), tank);
    }
}
