package Danny.classes.TaskCarSimulation;

public class AeroDynamicCar extends Car {
    public AeroDynamicCar(String manufacturer, String model, Engine engine, int weight, Tank tank) {
        super(manufacturer, model, engine, weight, tank);
    }

    public void fuelConsumtionFactor() {
        engine.setFuelConsumtionFactor(0.5);
    }

    public int totalKmOfTankCapacity() {
        return ((int) (tank.getTankCapacity() / engine.consumptionOf1Km(getWeight(), engine.getkW(),
                engine.getDriveTyp())) * 2);
    }
}
