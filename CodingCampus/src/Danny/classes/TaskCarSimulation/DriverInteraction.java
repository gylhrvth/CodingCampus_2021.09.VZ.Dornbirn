package Danny.classes.TaskCarSimulation;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DriverInteraction {
    private List<Car> carList;
    private Car selectedCar;
    private int totalCoveredDistance;

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
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mit welchem Auto magst du fahren?");
        selectedCar = carList.get(scanner.nextInt());
        System.out.println(selectedCar);
    }

    public void beforeDrive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Wie hoch ist der Tankinhalt. Eingabe: 1 - 80");
        selectedCar.tank.setTankCapacity(scanner.nextInt());

    }

    public int howFarDrive() {
        try {
            System.out.println("Tankinhalt "+ selectedCar.tank.getTankCapacity());
            System.out.println("Der Tank reicht fuer " + selectedCar.totalKmOfTankCapacity() + " Km");
            System.out.println("Wieviele Km willst du fahren?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (NoSuchElementException e) {
            System.out.println("Provided value is invalid!");
        }
        return 0;
    }

    public void driveAndAfterDrive() {
        int kilometerToDrive = howFarDrive();
        int kilometerCanDrive = selectedCar.driveCar(kilometerToDrive);
        if (kilometerCanDrive == kilometerToDrive) {
            drivePrint(kilometerToDrive);
            coveredDistancePrint(kilometerToDrive);
            totalCoveredDistance += kilometerToDrive;
            totalCoveredDistancePrint(totalCoveredDistance);
            System.out.println("Tankinhalt "+ selectedCar.tank.getTankCapacity());
        } else {
            drivePrint(kilometerCanDrive);
            System.out.println();
            System.out.println("Du bist " + kilometerCanDrive + " km gefahren. Der Tank ist leer!");
            refuel();
            kilometerCanDrive = selectedCar.driveCar(kilometerToDrive - kilometerCanDrive);
            drivePrint(kilometerCanDrive);
            coveredDistancePrint(kilometerToDrive);
            totalCoveredDistance += kilometerToDrive;
            totalCoveredDistancePrint(totalCoveredDistance);
            System.out.println("Tankinhalt "+ selectedCar.tank.getTankCapacity());
        }
    }

    public void coveredDistancePrint(int kilometerToDrive) {
        System.out.println();
        System.out.println();
        System.out.println("Es wurden " + kilometerToDrive + " Km zurückgelegt.");
    }

    public void totalCoveredDistancePrint(int totalCoveredDistance) {
        System.out.println();
        System.out.println();
        System.out.println("Es wurden insgesammt " + totalCoveredDistance + " Km zurückgelegt.");
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wieviel willst du tanken? Eingabe: 1 - 80");
        selectedCar.tank.setTankCapacity(scanner.nextDouble());
    }

    public boolean driveAgain() {
        Boolean driveAgain;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Möchtest du weiter fahren");
        System.out.println("1 = Ja | 2 = Nein");
        if (scanner.nextInt() == 1) {
            driveAgain = true;
            return driveAgain;
        } else if (scanner.nextInt() == 2) {
            driveAgain = false;
            return driveAgain;
        }
        return true;
    }
}
