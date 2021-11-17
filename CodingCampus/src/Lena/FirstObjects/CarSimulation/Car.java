package Lena.FirstObjects.CarSimulation;

public class Car {
    private String manufacturer;
    private String model;

    private Fuel fuel;
    private double weight;
    private int numbersOfKilometers=0;
    private Engine engine;
    private Tank tank;

    public Car(String manufacturer, String model, Fuel fuel, double weight, Engine engine, Tank tank) {
        setManufacturer(manufacturer);
        setModel(model);
        setFuel(fuel);
        setWeight(weight);
        this.engine = engine;
        this.tank=tank;

    }

    public int drive(int kilometers) throws Exception {
        double consumption = calculateConsumption(kilometers);
        int letfKilometers = calculateLeftKilometers();
        this.engine.startEngine();

        try {
            if (checkTankLevel(kilometers)) {

                this.tank.setTanklevel(this.tank.getTanklevel() - consumption);
                this.numbersOfKilometers += kilometers;
                System.out.println("Das Auto ist " + kilometers + "km gefahren.");
                this.engine.stopEngine(kilometers);
                return kilometers;
            }
            this.engine.stopEngine(0);
        } catch (OutOfFuelException e) {
            if (letfKilometers > 0) {
                System.out.println("Das Auto ist nur noch " + letfKilometers + "km gefahren");
                this.numbersOfKilometers += letfKilometers;
                this.tank.setTanklevel(0);
                this.engine.stopEngine(letfKilometers);
                throw e;
                //return kilometers - letfKilometers;
            } else {
                throw e;
            }

        }
        return kilometers;

    }

    public void carIsBroken() {
        System.out.println("Das Auto kann nicht fahren, da der Motor defekt ist");
        throw new IllegalArgumentException("Der Motor ist kaputt");
    }


    private boolean checkTankLevel(int kilometers) throws OutOfFuelException {
        if (this.tank.getTanklevel() - calculateConsumption(kilometers) < 0) {
            System.out.println("Der Tank reicht nicht mehr");
            throw new OutOfFuelException("Der Dank reicht nicht mehr für diese Strecke");
        }
        return true;
    }

    public double calculateConsumption(int kilometers) {
        if(this.fuel.equals(Fuel.STROM)){
            return (((engine.getkW() + this.weight) / 90 / 100) * kilometers);
        }
        return (((engine.getkW() + this.weight) / 90 / 100) * kilometers);
    }

    private int calculateLeftKilometers() {

        return (int) (this.tank.getTanklevel() / (((engine.getkW() + this.weight)) / 90 / 100));
    }

    public int getNumbersOfKilometers() {
        return numbersOfKilometers;
    }

    public void setNumbersOfKilometers(int numbersOfKilometers) {
        this.numbersOfKilometers = numbersOfKilometers;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tank getTank() {
        return tank;
    }

    @Override
    public String toString() {
        return "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", numbersOfKilometers=" + numbersOfKilometers +
                ", tanklevel=" + (Math.round(tank.getTanklevel()*100)/100) +
                '}';
    }
}
