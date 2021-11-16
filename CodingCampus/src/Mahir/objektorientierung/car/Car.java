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

    public void autoCarSimulation(){


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
        System.out.println("Refueled:" + usedFuel);
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
        return String.format("Manufacturer: %s Model: %s Kw: %d Fuel capacity: %.2f Weight: %d",
                manufacturer, model, kW, fuelCapacity, weight);

    }
}
