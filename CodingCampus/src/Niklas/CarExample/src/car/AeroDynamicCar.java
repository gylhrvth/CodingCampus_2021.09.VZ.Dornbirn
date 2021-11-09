package Niklas.CarExample.src.car;

public class AeroDynamicCar extends Car{
    public AeroDynamicCar(String producer, String model, int kwPower, double fuelTankStand, MOTOR_TYPE motorType,
                          int weight) {
        super(producer, model, kwPower, fuelTankStand, motorType, weight);
    }

    public AeroDynamicCar(String producer, String model, int kwPower, MOTOR_TYPE motorType, int weight, Engine engine) {
        super(producer, model, kwPower, motorType, weight, engine);
        // (kwPower + weight) / 90.0 / 100.0 / 2
        super.setConsumption(super.getConsumption()/2);
    }


    public void driveSuper(){
    }



}
