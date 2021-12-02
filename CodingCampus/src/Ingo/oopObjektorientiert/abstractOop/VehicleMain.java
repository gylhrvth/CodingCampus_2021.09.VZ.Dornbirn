package Ingo.oopObjektorientiert.abstractOop;

import java.util.ArrayList;
import java.util.List;

public class VehicleMain {
    public static void main(String[] args) {

        List<Vehicle> vehicles = createVehicles(10);
        drive(100,vehicles);

    }
    public static void drive(int km, List<Vehicle> vehicles) {
        for (int i = 0; i < vehicles.size(); i++) {
            vehicles.get(i).drive(km);
        }
    }

    public static List<Vehicle> createVehicles(int number) {
        List<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if(Math.random() >= 0.5) {
                vehicles.add(new Bicycle());
            }else {
                vehicles.add(new Car());
            }
        }return vehicles;
    }

}
