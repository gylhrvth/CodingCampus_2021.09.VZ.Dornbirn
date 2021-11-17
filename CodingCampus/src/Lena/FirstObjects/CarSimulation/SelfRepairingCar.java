package Lena.FirstObjects.CarSimulation;

public class SelfRepairingCar extends Car {


    public SelfRepairingCar(String manufacturer, String model, Fuel fuel, double weight, Engine engine, Tank tank) {
        super(manufacturer, model, fuel, weight, engine, tank);
    }


    @Override
    public void carIsBroken(){
        repairCar();
    }

    private void repairCar(){
        this.setEngine(new Engine(80));
        System.out.println("Motor wurde repariert");
    }
}
