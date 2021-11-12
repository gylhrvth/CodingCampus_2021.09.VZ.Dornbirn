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
        engine.uppedWearValue(kmDrive);
    }

    public boolean isBroken() {
        return engine.isBroken();
    }

    public boolean isFuelEmpty() {
        return tank.isTankEmpty();
    }

    public int totalKmOfTankCapacity() {
        return (int) (tank.getTankCapacity() / engine.consumptionOf1Km(getWeight(), engine.getkW(), engine.getDriveTyp()));
    }

    public int driveCar(int kilometerToDrive) {
        int kmDrive = 0;
        if (!isFuelEmpty()) {
            engine.startEngine();
        }
        do {
            fuelConsumtionFactor();
            wearConsumtionFactor();
            engine.runEngine(tank, getWeight());
            kmDrive++;
            isFuelEmpty();
            isEngineDefect(kmDrive);
        } while (kilometerToDrive != kmDrive && !isFuelEmpty() && !isBroken());
        engine.stopEngine();
        return kmDrive;
    }

    public void fuelConsumtionFactor() {
        engine.setFuelConsumtionFactor(1);
    }

    public void wearConsumtionFactor() {
        engine.setWearConsumtionFactor(1);
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        if (engine.getDriveTyp() == DRIVE_TYP.electricity) {
            return String.format(
                    "| %-8s %-8s | Power: %3d KW | Drive Typ: %12s | Weight: %4d kg | TankCapacity: %4d kWh",
                    this.manufacturer, this.model, this.engine.getkW(),
                    this.engine.getDriveTyp(), this.weight, this.tank.getMaxTank());
        } else if (engine.getDriveTyp() == DRIVE_TYP.gas) {
            return String.format(
                    "| %-8s %-8s | Power: %3d KW | Drive Typ: %12s | Weight: %4d kg | TankCapacity: %4d kg",
                    this.manufacturer, this.model, this.engine.getkW(),
                    this.engine.getDriveTyp(), this.weight, this.tank.getMaxTank());
        }
        return String.format(
                "| %-8s %-8s | Power: %3d KW | Drive Typ: %12s | Weight: %4d kg | TankCapacity: %4d Liter",
                this.manufacturer, this.model, this.engine.getkW(),
                this.engine.getDriveTyp(), this.weight, this.tank.getMaxTank());
    }
}