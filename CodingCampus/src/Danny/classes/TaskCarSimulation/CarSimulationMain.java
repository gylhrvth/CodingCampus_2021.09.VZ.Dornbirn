package Danny.classes.TaskCarSimulation;

import java.util.ArrayList;
import java.util.List;

public class CarSimulationMain {
    static Car auto1 = new Car("Audi", "TT", 180, DRIVE_TYP.gasoline, 1370);
    static Car auto2 = new Car("Ford", "Mondeo", 110, DRIVE_TYP.diesel, 1577);
    static Car auto3 = new Car("Fiat", "Panda", 59, DRIVE_TYP.gas, 1155);
    static Car auto4 = new Car("Tesla", "Model 3", 350, DRIVE_TYP.electricity, 1847);

    public static Car[] cars = new Car[]{auto1, auto2, auto3, auto4};

    public static void main(String[] args) {


        printCars(carList(cars));
        System.out.println();
        System.out.println();
        auto1.beforeDrive();
        auto1.coveredDistance(auto1.driveCar(auto1.howFarDrive()));
    }

    public static List carList(Car[] cars) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            carList.add(cars[i]);
        }
        return carList;
    }

    public static void printCars(List<Car> carList) {
        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
