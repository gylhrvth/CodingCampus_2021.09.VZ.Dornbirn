package Stefan.Week10.CarSimulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Skoda", "Fabia", 68, 50, 1081);
        Car car2 = new Car("VW", "Tiguan", 92, 50, 1490);

        Car[] cars = new Car[]{car1, car2};
        List<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(cars));


        CarMethoden.printCarList(carsList);
    }
}
