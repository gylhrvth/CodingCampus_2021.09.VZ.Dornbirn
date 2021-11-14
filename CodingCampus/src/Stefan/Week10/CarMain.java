package Stefan.Week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Skoda", "Fabie", 68, 50, 1081);

        Car[] cars = new Car[]{car1};
        List<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(cars));


        CarMethoden.printCarList(carsList);
    }
}
