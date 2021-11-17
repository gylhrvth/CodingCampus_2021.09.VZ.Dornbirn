package Lena.FirstObjects.CarSimulation;

public class AeroDynamicCar extends Car{
    public AeroDynamicCar(String manufacturer, String model, Fuel fuel, double weight, Engine engine, Tank tank) {
        super(manufacturer, model, fuel, weight, engine, tank);
    }

    public double calculateConsumption(int kilometers) {

        return ((((this.getEngine().getkW() + this.getWeight()) / 90 / 100) * kilometers)/2);
    }
}
