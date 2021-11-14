package Stefan.Week10.CarSimulation;

import Stefan.Week10.CarSimulation.Car;

import java.util.List;

public class CarMethoden {
    public static void printCarList(List<Car> carsList) {
        for (Car cars : carsList) {
            System.out.println(cars);
        }
    }
}
