package Danny.classes.TaskCarSimulation;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DriverInteraction {
    private List<Car> carList;
    private Car selectedCar;
    private int totalCoveredDistance;
    Scanner scanner = new Scanner(System.in);
    RepairStation repairHarry = new RepairStation(selectedCar);


    public DriverInteraction() {
        carList = new ArrayList<>();
        generateCars();
    }

    public void start() {
        whichCar();
        beforeDrive();
    }

    private void generateCars() {
        Car auto1 = new Car("Audi", "TT", new Engine(100, DRIVE_TYP.gasoline), 1370);
        Car auto2 = new Car("Ford", "Mondeo", new Engine(110, DRIVE_TYP.diesel), 1577);
        Car auto3 = new Car("Fiat", "Panda", new Engine(59, DRIVE_TYP.gas), 1155);
        Car auto4 = new Car("Tesla", "Model 3", new Engine(350, DRIVE_TYP.electricity), 1847);
        carList.add(auto1);
        carList.add(auto2);
        carList.add(auto3);
        carList.add(auto4);
    }

    public void printCars() {
        for (int i = 0; i < carList.size(); i++) {
            System.out.println("[" + i + "]" + carList.get(i));
        }
    }

    public void whichCar() {
        System.out.println();
        printCars();
        System.out.println("\nMit welchem Auto magst du fahren?");
        selectedCar = carList.get(scanner.nextInt());
        System.out.println(selectedCar);
    }

    public void beforeDrive() {
        System.out.println("\nWie hoch ist der Tankinhalt. Eingabe: 1 - 80");
        selectedCar.tank.setTankCapacity(scanner.nextInt());
    }

    public int howFarDrive() {
        try {
            System.out.printf("Tankinhalt: %.0f" + "\n", selectedCar.tank.getTankCapacity());
            System.out.printf("Der Tank reicht fuer %d Km" + "\n", selectedCar.totalKmOfTankCapacity());
            System.out.println("Wieviele Km willst du fahren?");
            return scanner.nextInt();
        } catch (NoSuchElementException e) {
            System.out.println("Provided value is invalid!");
        }
        return 0;
    }

    public void driveAndAfterDrive() {
        int kilometerToDrive = howFarDrive();
        int kilometerCanDrive = 0;
        do {
            kilometerCanDrive = selectedCar.driveCar(kilometerToDrive);
            if (kilometerCanDrive == kilometerToDrive) {
                drivePrint(kilometerToDrive);
                coveredDistancePrint(kilometerToDrive);
                totalCoveredDistance += kilometerToDrive;
                totalCoveredDistancePrint(totalCoveredDistance);
                System.out.printf("Tankinhalt: %.0f" + "\n", selectedCar.tank.getTankCapacity());
                System.out.println("Motor Verschleiß " + selectedCar.engine.getWearValue() + " von " + selectedCar.engine.getWearValueToRepair());
            } else if (kilometerCanDrive != kilometerToDrive && selectedCar.tank.getTankCapacity() < 1.0) {
                drivePrint(kilometerCanDrive);
                System.out.println("\nDu bist " + kilometerCanDrive + " km gefahren. Der Tank ist leer!");
                refuel();
                kilometerCanDrive = kilometerToDrive - kilometerCanDrive;
            } else if (kilometerCanDrive != kilometerToDrive && selectedCar.engine.getWearValue() >= selectedCar.engine.getWearValueToRepair()) {
                drivePrint(kilometerCanDrive);
                System.out.println("\nMotor Verschleiß " + selectedCar.engine.getWearValue() + " von " + selectedCar.engine.getWearValueToRepair());
                System.out.println("Du bist " + kilometerCanDrive + " km gefahren.\n" +
                        "Der Motor ist defekt!\n" +
                        "ÖAMTC ist unterwegs...Das Auto wurde in die Werstatt gebracht.");
                kilometerCanDrive = kilometerToDrive - kilometerCanDrive;
                kilometerCanDrive = repair(kilometerCanDrive,kilometerToDrive);
            }
        } while (kilometerCanDrive != kilometerToDrive);
    }

    public void coveredDistancePrint(int kilometerToDrive) {
        System.out.println("\nEs wurden " + kilometerToDrive + " Km zurueckgelegt.");
    }

    public void totalCoveredDistancePrint(int totalCoveredDistance) {
        System.out.println("\nEs wurden insgesammt " + totalCoveredDistance + " Km zurueckgelegt.");
    }

    public void drivePrint(int kilometerToDrive) {
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

    public void refuel() {
        System.out.println("\nWieviel willst du tanken? Eingabe: 1 - 80");
        selectedCar.tank.setTankCapacity(scanner.nextDouble());
    }

    public int repair(int kilometerCanDrive, int kilometerToDrive) {
        System.out.println("\nDas Autto wird repariert.");
        repairHarry.setRepairCar(selectedCar);
        repairHarry.repairCar(repairHarry.getRepairCar());
        try {
            for (int i = 0; i < 25; i++) {
                System.out.print(">");
                Thread.sleep(500);
            }
        } catch (InterruptedException exc) {
            //noop
        }
        System.out.println("\nDas Auto wurde repariert.");
        System.out.println("Motor Verschleiß " + selectedCar.engine.getWearValue() + " von " + selectedCar.engine.getWearValueToRepair());
        System.out.println("Möchtest du weiter fahren");
        System.out.println("1 = Ja | 2 = Nein");
        if (scanner.nextInt() == 1) {
            return kilometerCanDrive;
        } else {
            return kilometerToDrive;
        }
    }

    public boolean driveAgain() {
        Boolean driveAgain;
        System.out.println("Möchtest du weiter fahren");
        System.out.println("1 = Ja | 2 = Nein");
        if (scanner.nextInt() == 1) {
            driveAgain = true;
            return driveAgain;
        } else  {
            driveAgain = false;
            return driveAgain;
        }
    }

}
