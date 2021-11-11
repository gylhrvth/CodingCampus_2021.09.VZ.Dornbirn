package Danny.classes.TaskCarSimulation;

public class Car {
    private String manufacturer;
    private String model;
    protected Engine engine;
    private int weight;
    protected Tank tank;


    public Car(String manufacturer, String model, Engine engine, int weight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.tank = new Tank(5);
    }

    public int totalKmOfTankCapacity() {
        int totalKmOfTankCapacity = (int) (tank.getTankCapacity() / consumptionOf1Km(getWeight(), engine.getkW(), engine.getDriveTyp()));
        return totalKmOfTankCapacity;
    }

    public int driveCar(int kilometerToDrive) {
        int kmDrive = 0;
        do {
            tank.setTankCapacity(tank.getTankCapacity() - (consumptionOf1Km(getWeight(), engine.getkW(), engine.getDriveTyp())));
            kmDrive++;
            engine.setWearValue(engine.getWearValue() + engine.randomDefekt());
            if (kmDrive % 20 == 0) {
                engine.setRandomBound(engine.getRandomBound() + 1);
            }
        } while (kilometerToDrive != kmDrive && tank.getTankCapacity() > 1.0 && engine.getWearValue() < engine.getWearValueToRepair());
        return kmDrive;

    }

    //Verbrauch pro Km in Liter
    public double consumptionOf1Km(int weight, int kW, DRIVE_TYP DRIVETYP) {
        if (DRIVETYP == DRIVE_TYP.gasoline) {
            double consumptionOf100Km = (weight + kW) / 182;
            double consumptionOf1Km = ((consumptionOf100Km / 100) * 100) / 100;
            return consumptionOf1Km;
        } else if (DRIVETYP == DRIVE_TYP.diesel) {
            double consumptionOf100Km = (weight + kW) / 392;
            double consumptionOf1Km = ((consumptionOf100Km / 100) * 100) / 100;
            return consumptionOf1Km;
        } else if (DRIVETYP == DRIVE_TYP.gas) {
            double consumptionOf100Km = (weight + kW) / 392;
            double consumptionOf1Km = ((consumptionOf100Km / 100) * 100) / 100;
            return consumptionOf1Km;
        } else if (DRIVETYP == DRIVE_TYP.electricity) {
            double consumptionOf100Km = (weight + kW) / 137;
            double consumptionOf1Km = ((consumptionOf100Km / 100) * 100) / 100;
            return consumptionOf1Km;
        }
        return 0;
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
                "| %-6s %-8s | Power: %3d KW | Drive Typ: %8s | Weight: %4d kg",
                this.manufacturer, this.model, this.engine.getkW(),
                this.engine.getDriveTyp(), this.weight);
    }

}

