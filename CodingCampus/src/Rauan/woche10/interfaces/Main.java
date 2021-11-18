package Rauan.woche10.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<canDrive> drives = new ArrayList<>();

        List<canSwim> swims = new ArrayList<>();

        AmphibienFahrzeug amphibienFahrzeug = new AmphibienFahrzeug();
        drives.add(amphibienFahrzeug);
        drives.add(new Auto());
        drives.add(new Fahrrad());

        swims.add(amphibienFahrzeug);
        swims.add(new MotorBoat());
        swims.add(new PaddleBoat());

        drive(100,drives);
        swim(40,swims);

    }
    private static void drive (int km, List<canDrive> drivingThings){
        for (canDrive drive:drivingThings) {
            drive.drive(km);
        }
    }

    private static void swim(int km, List<canSwim> simmingThings){
        for (canSwim swim:simmingThings) {
            swim.swim(km);
        }
    }
}
