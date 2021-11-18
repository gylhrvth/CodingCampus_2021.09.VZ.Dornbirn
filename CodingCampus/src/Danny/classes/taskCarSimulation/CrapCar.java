package Danny.classes.taskCarSimulation;

public class CrapCar extends Car {
    public CrapCar(String manufacturer, String model, Engine engine, int weight, Tank tank) {
        super(manufacturer, model, engine, weight, tank);
    }

    public void wearConsumtionFactor() {
        engine.setWearConsumtionFactor(2);
    }
}
