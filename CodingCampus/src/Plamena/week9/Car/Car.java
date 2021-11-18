package Plamena.week9.Car;

import java.util.Scanner;

public class Car {
    private static Scanner sc = new Scanner(System.in);
    private final String manufacturer;
    private final String model;
    private int power;
    private int weight;
    private Tank tank;

    public Car(String manufacturer, String model, int power, int weight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.power = power;
        this.weight = weight;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public int getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    public double drive(int distance) {
        double availableFuelBeforeRunningOut = tank.getFuelStand();
        double brakeSpecificFuelConsumptionPer100km = (double) this.weight / (double) this.power;
        double availableDistance = (availableFuelBeforeRunningOut / brakeSpecificFuelConsumptionPer100km) * 100;
        this.tank.setFuelStand(tank.getFuelStand());
        double driven = 0;
        if(availableDistance <= distance) {
            for (int i = 0; i <= availableDistance; i++) {
                if (i % 10 == 0 || i == (int) availableDistance) {
                    System.out.println("-----> driving " + i + "km.");
                }
            }
            driven = availableDistance;
        } else if(availableDistance > distance){
            for (int i = 0; i <= distance; i++) {
                if (i % 10 == 0 || i == distance) {
                    System.out.println("-----> driving " + i + "km.");
                }
            }
            driven = distance;
        }
            return driven;

    }

//
//    public int drive(int distance){
//        double brakeSpecificFuelConsumptionPer100km = (double) this.weight / (double) this.power;
//        double availableDistance = (tank.getFuelStand() / brakeSpecificFuelConsumptionPer100km) * 100;
//        double distanceLeft = distance - availableDistance;
//        if(availableDistance <= distance){
//            tank.setFuelStand(0.0);
//
//        }
//
//    }
}
