package Niklas.CarExample.src.car;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        Engine porscheEngine = new Engine(3436);

        Car tesla = new Car("Tesla", "Model 3", 225, MOTOR_TYPE.ELECTRO, 1600, new Engine() );
        Car porsche = new Car("Porsche", "911", 270, MOTOR_TYPE.GASOLINE, 1450, porscheEngine);

        List<Car> cars = new LinkedList(List.of(tesla, porsche));

        porsche.setFuelTankStand(68);
       // UserInputhandler userInputhandler = new UserInputhandler(cars);
       // userInputhandler.startDialog();

        RepairStation repairStation = new RepairStation();

        repairStation.repair(porsche);
    }
}
