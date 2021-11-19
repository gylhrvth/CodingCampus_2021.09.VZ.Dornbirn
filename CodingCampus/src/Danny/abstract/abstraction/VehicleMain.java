package Danny;

import java.util.ArrayList;
import java.util.List;

public class VehicleMain {
    public static void main(String[] args) {
        List<Vehicle> vehicles = createVehicles(10);
        drive(100, vehicles);

        Vehicle rollerblades = new Vehicle() {
            @Override
            public void start() {
                System.out.println("Ich ziehe mein Rollerblades an und roll davon!");
            }

            @Override
            public void stop() {
                System.out.println("Ich machen einen T-Break und ziehe die Rollerblades aus!");
            }
        };
        rollerblades.drive(1000);
    }

    public static void drive(int km, List<Vehicle> vehicles) {
        for (int i = 0; i < vehicles.size(); i++) {
            vehicles.get(i).drive(km);
        }
    }

    public static List<Vehicle> createVehicles(int number) {
        List<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if (Math.random() >= 0.5) {
                vehicles.add(new Bicycle());
            } else {
                vehicles.add(new Car());
            }
        }
        return vehicles;
    }
}
