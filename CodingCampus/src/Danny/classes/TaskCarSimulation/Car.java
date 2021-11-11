package Danny.classes.TaskCarSimulation;

public class Car {
    private String manufacturer;
    private String model;
    protected Engine engine;
    private int weight;
    protected Tank tank;


    public Car(String manufacturer, String model, Engine engine, int weight, Tank tank) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.tank = tank;
    }

    public void isEngineDefect(int kmDrive) {
        engine.calculateWearValue(kmDrive);
    }

    public boolean isBroken() {
        return engine.isBroken();
    }

    public boolean isEmpty() {
        return tank.isTankEmpty();
    }

    public int totalKmOfTankCapacity() {
        return (int) (tank.getTankCapacity() / engine.consumptionOf1Km(getWeight(), engine.getkW(), engine.getDriveTyp()));
    }

    public int driveCar(int kilometerToDrive) {
        int kmDrive = 0;
        do {
            if (!isEmpty()) {
                engine.startEngine(tank, getWeight());
            }
            kmDrive++;
            isEmpty();
            isEngineDefect(kmDrive);
        } while (kilometerToDrive != kmDrive && !isEmpty() && !isBroken());
        engine.stopEngine();
        return kmDrive;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format(
                "| %-6s %-8s | Power: %3d KW | Drive Typ: %12s | Weight: %4d kg | TankCapacity: %4d",
                this.manufacturer, this.model, this.engine.getkW(),
                this.engine.getDriveTyp(), this.weight, this.tank.getMaxTank());
    }

}

