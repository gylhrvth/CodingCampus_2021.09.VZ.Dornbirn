package Ingo.week7.oop.car;

public class Car {

    private String manufacturer;
    private String model;
    private int kw;
    private double fuelCapacity;
    private ENGINE_TYPE ENGINE_TYPE;
    private int weight;
    private double consumption;

    public double getConsumption() {
        return consumption;
    }

    public Car(String manufacturer, String model, int kw, double fuelCapacity, double consumption, ENGINE_TYPE ENGINE_TYPE, int weight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.kw = kw;
        this.fuelCapacity = fuelCapacity;
        this.ENGINE_TYPE = ENGINE_TYPE;
        this.weight = weight;
        this.consumption = consumption;
    }
    public int drive(int km) {
        double usedFuel = consumption / 100 * km;
        return (int) usedFuel;
    }





    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getKw() {
        return kw;
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

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", kw=" + kw +
                ", fuelCapacity=" + fuelCapacity +
                ", ENGINE_TYPE=" + ENGINE_TYPE +
                ", weight=" + weight +
                ", comsumption=" + consumption +
                '}';
    }
}
