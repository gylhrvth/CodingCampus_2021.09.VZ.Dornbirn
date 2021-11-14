package Ingo.week7.oop.car;

public class Car {

    private String manufacturer;
    private String model;
    private int kw;
    private double fuelCapacity;
    private EngineType engineType;
    private int weight;
    private double consumption;

    public double getConsumption() {
        return consumption;
    }

    public Car(String manufacturer, String model, int kw, double fuelCapacity, double consumption, EngineType engineType, int weight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.kw = kw;
        this.fuelCapacity = fuelCapacity;
        this.engineType = engineType;
        this.weight = weight;
        this.consumption = consumption;
    }
    public double drive(double km) {
        return consumption / 100 * km;
    }

    public boolean refuel(int fuel) {
        System.out.println("How much do you want to refuel?");
        setFuelCapacity(getFuelCapacity()+ fuel);
        System.out.println(getFuelCapacity());
        return false;
    }
    public void emptyFuel() {
        if(fuelCapacity == 0) {
            System.out.println(refuel(10));
        }
    }

    public void driveCar(double km) {
        System.out.print(consumption / 100 * km + "%.2f");
    }

    public void maxDistance() {
        System.out.println(fuelCapacity / consumption * 100);
    }

    public String getFormattedFuelCapacity() {
        return String.format("%.2f", fuelCapacity);
    }

    public double fuelCapacity(double getFuel){
        getFormattedFuelCapacity();
        return getFuel;
    }
    public String carModel(){
        return getModel();
    }
    public void printAutoModel() {
        System.out.println(getModel());
    }
    public void maxDistanceWithFullTank() {
        double maxDistance = fuelCapacity / consumption * 100;
        System.out.println(maxDistance);
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

    public EngineType getEngineType() {
        return engineType;
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
                ", ENGINE_TYPE=" + engineType +
                ", weight=" + weight +
                ", comsumption=" + consumption +
                '}';
    }
}
