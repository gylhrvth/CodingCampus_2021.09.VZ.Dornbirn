package Niklas.CarExample.src.car;

public class Car {
    private String producer;
    private String model;
    private int kwPower;
    private double consumption;
    private double fuelTankStand;
    private MOTOR_TYPE motorType;
    private int weight;
    private Engine engine;
    private int traveledDistance = 0;
    private int hitPoints = 1000;

    public Car(String producer, String model, int kwPower, double fuelTankStand, MOTOR_TYPE motorType, int weight) {
        this.producer = producer;
        this.model = model;
        this.kwPower = kwPower;
        this.fuelTankStand = fuelTankStand;
        this.motorType = motorType;
        this.weight = weight;
        this.consumption = (kwPower + weight) / 90.0 / 100.0;
    }

    public Car(String producer, String model, int kwPower, MOTOR_TYPE motorType, int weight, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.kwPower = kwPower;
        this.motorType = motorType;
        this.weight = weight;
        this.consumption = (kwPower + weight) / 90.0 / 100.0;
        this.engine = engine;
    }

    public int drive(int distanceToTravel) {
        if(this.engine.isTurnedOn()) {
            double actualConsumption = distanceToTravel * this.consumption;
            if (actualConsumption < this.fuelTankStand) {
                traveledDistance += distanceToTravel;
                this.fuelTankStand -= actualConsumption;
                hitPoints -= traveledDistance;
            } else {
                System.out.println("No sufficient fuel");
            }
        }

        return traveledDistance;
    }

    public void setFuelTankStand(double fuelTankStand) {
        this.fuelTankStand = fuelTankStand;
    }

    public String getModel() {
        return model;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", kwPower=" + kwPower +
                ", fuelTankStand=" + fuelTankStand +
                ", motorType=" + motorType +
                ", weight=" + weight +
                '}';
    }
}
