package Danny.classes.TaskCarSimulation;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Car {
    private String manufacturer;
    private String model;
    private int kW;
    private int tankCapacity;
    private DRIVE_TYP DRIVETYP;
    private int weight;


    public Car(String manufacturer, String model, int kW, DRIVE_TYP DRIVETYP, int weight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.setkW(kW);
        this.DRIVETYP = DRIVETYP;
        this.weight = weight;
    }

    public void beforeDrive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie hoch ist der Tankinhalt. Eingabe: 1 - 80");
        tankCapacity = scanner.nextInt();
    }

    public void refuel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wieviel willst du tanken? Eingabe: 1 - 80");
        tankCapacity = scanner.nextInt();
    }

    public int howFarDrive() {
        try {
            System.out.println("Wieviele Km willst du fahren?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (NoSuchElementException e) {
            System.out.println("Provided value is invalid!");
        }
        return 0;
    }

    public int totalTankKm(int tankCapacity) {
        int totalTankKm = (int) (tankCapacity / consumptionOf100Km(getWeight(), getkW(), getDriveTyp())) * 100;
        return totalTankKm;
    }

    public int driveCar(int kilometerToDrive) {
        if (kilometerToDrive < totalTankKm(tankCapacity)) {
            drivePrint(kilometerToDrive);
            return kilometerToDrive;
        } else {
            int kilometerCanDrive = totalTankKm(tankCapacity);
            drivePrint(kilometerCanDrive);
            System.out.println();
            System.out.println("Du bist " + kilometerCanDrive + " km gefahren. Der Tank ist leer!");
            refuel();
            drivePrint(kilometerToDrive-kilometerCanDrive);
            return kilometerToDrive;
        }
    }

    public void drivePrint (int kilometerToDrive) {
        try {
            for (int j = 0; j <= kilometerToDrive; j++) {
                System.out.println();
                System.out.println();
                String carRepat = " ";
                System.out.println(carRepat.repeat(j) + "  ___  " + carRepat.repeat(kilometerToDrive - j));
                carRepat = "_";
                System.out.print(carRepat.repeat(j) + "=o---o>" + carRepat.repeat(kilometerToDrive - j));
                Thread.sleep(15);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (InterruptedException exc) {
            //noop
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

    public void coveredDistance(int kilometerToDrive) {
        System.out.println();
        System.out.println();
        System.out.println("Es wurden " + kilometerToDrive + " Km zurückgelegt.");
    }

    public void setkW(int kW) {
        if (kW < 0) {
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.kW = kW;
    }

    public String getManufacturer() {
        return manufacturer;
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

}

