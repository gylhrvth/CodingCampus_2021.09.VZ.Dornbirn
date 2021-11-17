package Eray.week8andweek9.carSimulation.aufgabe2new;

import java.util.ArrayList;
import java.util.List;

public class MainToStartAll {
    public static void main(String[] args) {
        printAll();
    }

    public static void printAll() {
        Motor carMotor = new Motor();

        Car mercedes = new Car("Mercedes", "AMG C63s", 375, 70.00, ANTRIEBSART.BENZIN, 1500, "V8 6.2Liter");
        System.out.println(mercedes);

        Car tesla = new Car("Tesla", "Model 3", 300, ANTRIEBSART.ELEKTRO, 1400, "ELEKTRO");
        System.out.println(tesla);

        mercedes.setMotorDatas(carMotor);
        mercedes.setMotorStatus(carMotor.isTurnedOn());



        List<Car> cars = new ArrayList<>();
        cars.add(mercedes);
        cars.add(tesla);

        mercedes.setTankInhalt(70);
        BenutzerEingaben benutzerEingaben = new BenutzerEingaben(cars);

        benutzerEingaben.starteDialog();


        RepairStation repairStation = new RepairStation();
        repairStation.repair(mercedes);

    }




}
