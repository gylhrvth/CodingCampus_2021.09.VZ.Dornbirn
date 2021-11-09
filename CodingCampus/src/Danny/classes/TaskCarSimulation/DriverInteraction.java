package Danny.classes.TaskCarSimulation;

import java.util.*;

public class DriverInteraction {
    private List<Car> carList;
    private Car selectedCar;

    public DriverInteraction() {
        carList = new ArrayList<>();
        generateCars();
    }

    public void start() {
        whichCar();
        beforeDrive();
        driveAndAfterDrive();
    }

    private void generateCars() {
        Car auto1 = new Car("Audi", "TT", 180, DRIVE_TYP.gasoline, 1370);
        Car auto2 = new Car("Ford", "Mondeo", 110, DRIVE_TYP.diesel, 1577);
        Car auto3 = new Car("Fiat", "Panda", 59, DRIVE_TYP.gas, 1155);
        Car auto4 = new Car("Tesla", "Model 3", 350, DRIVE_TYP.electricity, 1847);
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
        selectedCar.setTankCapacity(scanner.nextInt());
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

    public void driveAndAfterDrive() {
        int kilometerToDrive = howFarDrive();
        selectedCar.driveCar(kilometerToDrive);
        if (kilometerToDrive < selectedCar.totalTankKm(selectedCar.tankCapacity)) {
            drivePrint(kilometerToDrive);
            coveredDistance(kilometerToDrive);
        } else {
            int kilometerCanDrive = selectedCar.totalTankKm(selectedCar.tankCapacity);
            drivePrint(kilometerCanDrive);
            System.out.println();
            System.out.println("Du bist " + kilometerCanDrive + " km gefahren. Der Tank ist leer!");
            refuel();
            drivePrint(kilometerToDrive - kilometerCanDrive);
            coveredDistance(kilometerToDrive);
        }
    }

    public void coveredDistance(int kilometerToDrive) {
        System.out.println();
        System.out.println();
        System.out.println("Es wurden " + kilometerToDrive + " Km zurückgelegt.");
    }

    public static void drivePrint(int kilometerToDrive) {
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
        selectedCar.setTankCapacity(scanner.nextInt());
    }


}
