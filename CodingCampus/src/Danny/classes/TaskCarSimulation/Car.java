package Danny.classes.TaskCarSimulation;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Car {
    private String manufacturer;
    private String model;
    private int kW;
    public int tankCapacity;
    private DRIVE_TYP DRIVETYP;
    private int weight;
    private int kilometerToDrive;
    private Tank tank;
    private Engine engine;

    public Car(String manufacturer, String model, int kW, DRIVE_TYP DRIVETYP, int weight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.setkW(kW);
        this.DRIVETYP = DRIVETYP;
        this.weight = weight;
    }

    public int totalTankKm(int tankCapacity) {
        int totalTankKm = (int) (tankCapacity / consumptionOf100Km(getWeight(), getkW(), getDriveTyp())) * 100;
        return totalTankKm;
    }

    public int driveCar(int kilometerToDrive) {
        if (kilometerToDrive < totalTankKm(tankCapacity)) {
            DriverInteraction.drivePrint(kilometerToDrive);
            return kilometerToDrive;
        } else {
            int kilometerCanDrive = totalTankKm(tankCapacity);
            DriverInteraction.drivePrint(kilometerCanDrive);
            System.out.println();
            System.out.println("Du bist " + kilometerCanDrive + " km gefahren. Der Tank ist leer!");
            DriverInteraction.drivePrint(kilometerToDrive - kilometerCanDrive);
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

    public void setkW(int kW) {
        if (kW < 0) {
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.kW = kW;
    }

    public void setTankCapacity(int tankCapacity) {
        if (kW < 0) {
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.tankCapacity = tankCapacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getkW() {
        return kW;
    }

    public DRIVE_TYP getDriveTyp() {
        return DRIVETYP;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format(
                "| %-6s %-8s | Power: %3d KW | Weight: %4d kg", this.manufacturer, this.model, this.kW, this.weight);
    }

}

