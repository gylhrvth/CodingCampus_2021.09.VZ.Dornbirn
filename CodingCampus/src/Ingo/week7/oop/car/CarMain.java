package Ingo.week7.oop.car;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {

        Car car1 = new Car("Renault", "Clio", 54, 45, 5.8, EngineType.GASOLINE, 1123);
        Car car2 = new Car("VW", "Golf 2", 40, 55, 7.7, EngineType.GASOLINE, 885);
        Car car3 = new Car("VW", "Käfer", 32, 38, 3.2, EngineType.DIESEL, 770);
        Car car4 = new Car("Tesla", "Model 3", 75, 76, 9.0, EngineType.ELECTRIC, 1900);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        System.out.println(cars);

        System.out.println(car1.drive(300));
        car3.refuel(10);

        System.out.println(car3.getEngineType());


    }


}




