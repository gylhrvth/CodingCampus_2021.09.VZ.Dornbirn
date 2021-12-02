package Eray.week10.strategy;

import java.util.ArrayList;
import java.util.List;

public class MovementMain {
    public static void main(String[] args) {
        List<CanDrive> drivingThings = new ArrayList<>();

        List<CanSwim> swimmingThings = new ArrayList<>();

        AmphibienVehicle amphibi = new AmphibienVehicle();

        drivingThings.add(amphibi);
        drivingThings.add(new Car());
        drivingThings.add(new Bicycle());
        System.out.println();

        swimmingThings.add(amphibi);
        swimmingThings.add(new Motorboat());
        swimmingThings.add(new Paddleboat());

        drive(50, drivingThings);
        swim(50, swimmingThings);
    }

    private static void drive(int km, List<CanDrive> drivingThings) {
        for (CanDrive drive : drivingThings) {
            drive.drive(km);
            System.out.println();
        }
    }

    private static void swim(int km, List<CanSwim> swimmingThings) {
        for (CanSwim swim : swimmingThings) {
            swim.swim(km);
            System.out.println();
        }
    }


}
