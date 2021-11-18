package Mahir.objektorientierung.car;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Car {
    private String manufacturer;
    private String model;
    private int kW;
    private double fuelCapacity;
    private ENGINE_TYPE ENGINE_TYPE;
    private int weight;
    private double consumption;

    public Car(String manufacturer, String model, int kW, double fuelCapacity, double consumption, ENGINE_TYPE ENGINE_TYPE, int weight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.kW = kW;
        this.fuelCapacity = fuelCapacity;
        this.consumption = consumption;
        this.ENGINE_TYPE = ENGINE_TYPE;
        this.weight = weight;

    }

    Scanner scanner = new Scanner(System.in);

    public void autoCarSimulation() {
        System.out.println("Enter distance to drive");
        int input = scanner.nextInt();
        int drivenDistance = 0;
        int drive = 0;
        double usedFuel = 0;
        while (drivenDistance <= input) {
            for (int i = 0; i <= drive; i++) {
                System.out.print(" ");
                if (drive == 50){
                    drive -= 50;
                }
            }
            System.out.print("~ ~ o==o>");

            secondCounter();
            clearScreen();
            if (fuelCapacity <= 0) {
                refuel(usedFuel);
                continue;
            }
            drivenDistance++;
            drive++;
            fuelCapacity -= consumption / 100;
            usedFuel += consumption / 100;
        }
        System.out.println();
        System.out.println("\nyou arrived!! \nDriven Distance: " + input + "KM\n used Fuel: " + String.format("%.2f", consumption / 100 * input) + "L");

    }

    public static void secondCounter() {
        try {
            //sending the actual Thread of execution to sleep X milliseconds
            Thread.sleep(200);
        } catch (InterruptedException ignored) {
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void carSimulation() {
        int input = 0;
        System.out.println("Enter distance to drive");
        double usedFuel = drive(scanner.nextInt());
        while (true) {
            System.out.println("Fuel Capacity: " + String.format("%.2f", getFuelCapacity()) + "L");
            System.out.print("1 - Drive\n2 - Go to Gas Station\n");
            input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Enter distance to drive");
                drive(scanner.nextInt());
                if (fuelCapacity == 0) {
                    System.out.println("1 - Push the Car to the Gas Station");
                    System.out.println("2 - Walk Home");
                    input = scanner.nextInt();
                    if (input == 1) {
                        refuel(usedFuel);
                        System.out.println("Refueled Car");
                    }
                    if (input == 2) {
                        System.out.println("U Left ur Car and Walked Home ");
                        break;
                    }
                }
            }
            if (input == 2) {
                System.out.println("Refueled Car");
                refuel(usedFuel);
            }
        }
    }


    public void refuel(double usedFuel) {
        System.out.println("Refueled:" +String.format("%.2f",usedFuel));
        setFuelCapacity(getFuelCapacity() + usedFuel);


    }

    public double drive(int km) {
        double usedFuel = consumption / 100 * km;
        double maxDistance = (fuelCapacity / consumption) * 100;
        if (usedFuel >= fuelCapacity) {
            setFuelCapacity(0);
            System.out.println(">>>>>> Fuel is Empty <<<<<<");
            System.out.println("Driven distance: " + String.format("%.2f Km ", maxDistance));
            return usedFuel;
        }
        setFuelCapacity(getFuelCapacity() - usedFuel);

        return usedFuel;
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

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public ENGINE_TYPE getEngineType() {
        return ENGINE_TYPE;
    }

    public int getWeight() {
        return weight;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getConsumption() {
        return consumption;
    }

    @Override
    public String toString() {
        return String.format("Manufacturer: %s Model: %s Kw: %d Fuel capacity: %.2f Weight: %d Consumption %.2f",
                manufacturer, model, kW, fuelCapacity, weight, consumption);

    }
}
