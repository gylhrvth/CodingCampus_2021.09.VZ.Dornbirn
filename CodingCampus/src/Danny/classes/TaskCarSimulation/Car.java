package Danny.classes.TaskCarSimulation;

public class Car {
    private String manufacturer;
    private String model;
    private int kW;
    private DRIVE_TYP DRIVETYP;
    private int weight;
    private double tankCapacity;


    public Car(String manufacturer, String model, int kW, DRIVE_TYP DRIVETYP, int weight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.setkW(kW);
        this.setDRIVETYP(DRIVETYP);
        this.weight = weight;
    }

    public void consumption(int drivedKm) {
        int consumption = (int) (drivedKm * (consumptionOf100Km(getWeight(), getkW(), getDriveTyp()) / 100));
        tankCapacity -= consumption;
    }

    public int totalKmOfTankCapacity() {
        int totalKmOfTankCapacity = (int) (getTankCapacity() / consumptionOf100Km(getWeight(), getkW(), getDriveTyp())) * 100;
        return totalKmOfTankCapacity;
    }

    public int driveCar(int kilometerToDrive) {
        int kmDrive = 0;
        do {
            tankCapacity -= (consumptionOf100Km(getWeight(), getkW(), getDriveTyp()) / 100);
            kmDrive++;
        } while (kilometerToDrive != kmDrive || tankCapacity > 1 );
        return kmDrive;

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

    public void setDRIVETYP(DRIVE_TYP DRIVETYP) {
        this.DRIVETYP = DRIVETYP;
    }

    public void setTankCapacity(double tankCapacity) {
        if (tankCapacity < 0) {
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.tankCapacity = tankCapacity;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setkW(int kW) {
        if (kW < 0) {
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.kW = kW;
    }

    public int getkW() {
        return kW;
    }

    public DRIVE_TYP getDriveTyp() {
        return DRIVETYP;
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
                this.manufacturer, this.model, this.getkW(),
                this.getDriveTyp(), this.weight);
    }

}

