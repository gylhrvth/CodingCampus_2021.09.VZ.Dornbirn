package Bartosz.oop.exercise4;

public class Car {
    private String brand;
    private String model;
    private Type type;
    private int tankCap;
    private int weight;
    private int power;

    public Car(String brand, String model, Type type, int tankCap, int weight, int power) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.tankCap = tankCap;
        this.weight = weight;
        this.power = power;
    }

    public int drive(int wayLength) {
        int maxTankCap = this.getTankCap();
        int consumptionRate = this.weight / this.power;

        int consumedTank = ((consumptionRate * wayLength) / 100);
        int updatedTank = maxTankCap - consumedTank;
        return updatedTank;
    }

    public int refuel_Recharge(int refueledTank) {
        this.setTankCap(refueledTank);
        return getTankCap();
    }

    // Berechne für wie viel KM der Sprit ausreicht
    public int leftForKM(int updatedTank) {
        int tmp = ((updatedTank * 100) / (this.weight / this.power));
        return tmp;
    }

    // Berechne wie viel Sprit noch übrig ist
    public int leftForFuel(Car selectedCar, int length){
        return selectedCar.drive(length);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getTankCap() {
        return tankCap;
    }

    public void setTankCap(int tankCap) {
        this.tankCap = tankCap;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return
                brand +
                        ", model= " + model +
                        ", type= " + type +
                        ", tankCap= " + tankCap +
                        ", weight= " + weight +
                        ", power= " + power;
    }
}

