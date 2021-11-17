package Lena.FirstObjects.CarSimulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(85);
        Tank tank = new Tank(80);
       // SelfRepairingCar selfRepairingCar = new SelfRepairingCar("Audi", "A1", Fuel.BENZIN, 1500, engine, tank);
        Car car = new Car("Tesla", "Model3", Fuel.STROM, 1500, engine, tank);


        driveCar(car);
    }

    @SuppressWarnings("InfiniteLoopStatement")
    private static void driveCar(Car car) {
        RepairStation repairStation = new RepairStation("abc");
        GasStation gasStation = new GasStation("kdjl");
        Scanner sc = new Scanner(System.in);

        int a = 10;

        while (true) {
            System.out.println(car);
            System.out.println("Wie viele Kilometer möchtest du fahren?");
            try {
                car.drive(sc.nextInt());
            } catch (EngineDefectException ede) {
                System.out.println(ede.getMessage());
                System.out.println("Möchtest du den Motor ersetzen?");
                if (sc.next().equals("ja")) {
                    repairStation.repairEngine(car);
                }
            } catch (OutOfFuelException e) {
                System.out.println(e.getMessage());
                System.out.println("Wie viel möchtest du tanken?");
                gasStation.fillTank(car, sc.nextInt());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
