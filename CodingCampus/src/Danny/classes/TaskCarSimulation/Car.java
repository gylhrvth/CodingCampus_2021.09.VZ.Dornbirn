package Danny.classes.TaskCarSimulation;

public class Car {
    private String manufacturer;
    private String model;
    private int weight;
    public Tank tank;
    private Engine engine;

    public Car(String manufacturer, String model, int kW, DRIVE_TYP DRIVETYP, int weight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine.setkW(kW);
        this.engine.getDriveTyp();
        this.weight = weight;
    }

    public int totalKmOfTankCapacity() {
        return (int) (tank.getTankCapacity() /
                consumptionOf100Km(getWeight(),
                        engine.getkW(), engine.getDriveTyp())) * 100;
    }

    public int driveCar(int kilometerToDrive) {
        DriverInteraction driverInteraction = new DriverInteraction();
        if (kilometerToDrive < totalKmOfTankCapacity()) {
            driverInteraction.drivePrint(kilometerToDrive);
            return kilometerToDrive;
        } else {
            int kilometerCanDrive = totalKmOfTankCapacity();
            driverInteraction.drivePrint(kilometerCanDrive);
            System.out.println();
            System.out.println("Du bist " + kilometerCanDrive + " km gefahren." +
                    " Der Tank ist leer!");
            driverInteraction.drivePrint(kilometerToDrive - kilometerCanDrive);
            return kilometerToDrive;
        }
    }

    public double consumptionOf100Km(int weight, int kW, DRIVE_TYP DRIVETYP) {
        if (DRIVETYP == DRIVE_TYP.gasoline) {
            double consumptionOf100Km = (weight + kW) / 182;
            return consumptionOf100Km;
        } else if (DRIVETYP == DRIVE_TYP.diesel) {
            double consumptionOf100Km = (weight + kW) / 392;
            return consumptionOf100Km;
        } else if (DRIVETYP == DRIVE_TYP.gas) {
            double consumptionOf100Km = (weight + kW) / 392;
            return consumptionOf100Km;
        } else if (DRIVETYP == DRIVE_TYP.electricity) {
            double consumptionOf100Km = (weight + kW) / 137;
            return consumptionOf100Km;
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
                this.manufacturer, this.model,this.engine.getDriveTyp(),
                this.engine.getkW(), this.weight);
    }

}

