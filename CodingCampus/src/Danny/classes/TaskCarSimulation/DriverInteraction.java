package Danny.classes.TaskCarSimulation;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DriverInteraction {
    private final List<Car> carList;
    private Car selectedCar;
    private int totalCoveredDistance;
    private final Scanner scanner = new Scanner(System.in);
    RepairStation repairHarry = new RepairStation();
    Gasstation gasLotte = new Gasstation();

    public DriverInteraction() {
        carList = new ArrayList<>();
        generateCars();
    }

    public void start() {
        whichCar();
        refuel();
        driveAndAfterDrive();
    }

    private void generateCars() {
        Car auto1 = new Car("Audi", "TT", new Engine(100, DRIVE_TYP.gasoline),
                1370, new Tank(80));
        Car auto2 = new Car("Ford", "Mondeo", new Engine(110, DRIVE_TYP.diesel),
                1577, new Tank(60));
        Car auto3 = new Car("Fiat", "Panda", new Engine(59, DRIVE_TYP.gas),
                1155, new Tank(85));
        Car auto4 = new Car("Tesla", "Model 3", new Engine(350, DRIVE_TYP.electricity),
                1847, new Tank(750));
        AeroDynamicCar auto5 = new AeroDynamicCar("Tesla", "Aero", new Engine(350,DRIVE_TYP.electricity),
                1847,new Tank(750));
        SelfRepairingCar auto6 = new SelfRepairingCar("SelfRep", "007", new Engine(350,DRIVE_TYP.electricity),
                1645,new Tank(750));
        CrapCar auto7 = new CrapCar("Crapi", "Shit", new Engine(150,DRIVE_TYP.diesel),
                1145,new Tank(50));


        carList.add(auto1);
        carList.add(auto2);
        carList.add(auto3);
        carList.add(auto4);
        carList.add(auto5);
        carList.add(auto6);
        carList.add(auto7);
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

    public int howFarDrive() {
        try {
            System.out.println("\nMotor Verschleiss " + selectedCar.engine.getWearValue() + " von " + selectedCar.engine.getWearValueToRepair());
            System.out.printf("Tankinhalt: %.1f" + "\n", selectedCar.tank.getTankCapacity());
            System.out.printf("Der Tank reicht fuer %d Km" + "\n", selectedCar.totalKmOfTankCapacity());
            System.out.println("Wieviele Km willst du fahren?");
            return scanner.nextInt();
        } catch (NoSuchElementException e) {
            System.out.println("Provided value is invalid!");
        }
        return 0;
    }

    public void driveAndAfterDrive() {
        int kilometerToDrive;
        int kilometerCanDrive = 0;
        kilometerToDrive = howFarDrive();

        boolean driveAgain = false;

        do {
            if (kilometerCanDrive == kilometerToDrive) {
                kilometerToDrive = howFarDrive();
            }
            kilometerCanDrive = selectedCar.driveCar(kilometerToDrive);
            if (kilometerCanDrive == kilometerToDrive) {
                printDrive(kilometerToDrive);
                printCoveredDistance(kilometerToDrive);
                totalCoveredDistance += kilometerToDrive;
                printTotalCoveredDistance(totalCoveredDistance);
                driveAgain = driveAgain();
            } else if (selectedCar.isFuelEmpty()) {
                printDrive(kilometerCanDrive);
                totalCoveredDistance += kilometerCanDrive;
                System.out.println("\nDu bist " + kilometerCanDrive + " km gefahren. Der Tank ist leer!");
                refuel();
                kilometerToDrive = kilometerToDrive - kilometerCanDrive;
                driveAgain = driveAgain();
            } else if (selectedCar.isBroken()) {
                printDrive(kilometerCanDrive);
                totalCoveredDistance += kilometerCanDrive;
                System.out.println("\nMotor Verschleiss " + selectedCar.engine.getWearValue() + " von " + selectedCar.engine.getWearValueToRepair());
                System.out.println("Du bist " + kilometerCanDrive + " km gefahren.\n" +
                        "Der Motor ist defekt!\n" +
                        "ÖAMTC ist unterwegs...Das Auto wird in die Werstatt gebracht.");
                timeOut();
                kilometerToDrive = kilometerToDrive - kilometerCanDrive;
                driveAgain = wouldRepair();
            }
        } while (driveAgain);
        printTotalCoveredDistance(totalCoveredDistance);
        System.out.printf("Tankinhalt: %.1f" + "\n", selectedCar.tank.getTankCapacity());
        System.out.println("Motor Verschleiss " + selectedCar.engine.getWearValue()
                + " von " + selectedCar.engine.getWearValueToRepair());
        System.out.println("Die Fahrt ist beendet.");
    }

    public void printCoveredDistance(int kilometerToDrive) {
        System.out.println("\nEs wurden " + kilometerToDrive + " Km zurueckgelegt.");
    }

    public void printTotalCoveredDistance(int totalCoveredDistance) {
        System.out.println("\nEs wurden insgesammt " + totalCoveredDistance + " Km zurueckgelegt.");
    }

    public void printDrive(int kilometerToDrive) {
        int lenght = 100;
        try {
            do {
                if (kilometerToDrive >= lenght) {
                    for (int j = 0; j <= lenght; j++) {
                        String carRepat = " ";
                        System.out.println(carRepat.repeat(j) + "  ___  " + carRepat.repeat(lenght - j));
                        carRepat = "_";
                        System.out.println(carRepat.repeat(j) + "=o--o>" + carRepat.repeat(lenght - j));
                        Thread.sleep(15);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                    }
                } else {
                    for (int j = 0; j <= kilometerToDrive; j++) {
                        String carRepat = " ";
                        System.out.println(carRepat.repeat(j) + "  ___  " + carRepat.repeat(kilometerToDrive - j));
                        carRepat = "_";
                        System.out.println(carRepat.repeat(j) + "=o--o>" + carRepat.repeat(kilometerToDrive - j));
                        Thread.sleep(15);
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                    }
                }
                kilometerToDrive -= lenght;
            } while (kilometerToDrive > 0);
        } catch (InterruptedException exc) {
            //noop
        }
    }

    public void timeOut() {
        try {
            for (int i = 0; i < 25; i++) {
                System.out.print(">");
                Thread.sleep(120);
            }
        } catch (InterruptedException exc) {
            //noop
        }
    }

    public void refuel() {
        System.out.println("\nWieviel willst du tanken? Eingabe: 1 - " + selectedCar.tank.getMaxTank());
        int fuel = scanner.nextInt();
        while (fuel > selectedCar.tank.getMaxTank() || fuel < 1) {
                System.out.println("Falsche Eingabe!!!");
                System.out.println("\nWieviel willst du tanken? Eingabe: 1 - " + selectedCar.tank.getMaxTank());
                fuel = scanner.nextInt();
        }
        gasLotte.refuel(selectedCar, fuel);
        System.out.println("\nDas Auto wird betankt.");
        timeOut();
    }

    public void repair() {
        System.out.println("\nDas Autto wird repariert.");
        repairHarry.repairCar(selectedCar);
        timeOut();
        System.out.println("\nDas Auto wurde repariert.");
        System.out.println("Motor Verschleiss " + selectedCar.engine.getWearValue()
                + " von " + selectedCar.engine.getWearValueToRepair());
    }

    public boolean driveAgain() {
        System.out.println("\nMoechtest du weiter fahren");
        System.out.println("1 = Ja | 2 = Nein");

        return scanner.nextInt() == 1;
    }

    public boolean wouldRepair() {
        System.out.println("\nMoechtest du das Auto reparieren");
        System.out.println("1 = Ja | 2 = Nein");
        if (scanner.nextInt() == 1) {
            repair();
            return driveAgain();
        } else {
            return false;
        }
    }

}