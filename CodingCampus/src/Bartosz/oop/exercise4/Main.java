package Bartosz.oop.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // cars
        Car car1 = new Car("Volks", "Golf", Type.HYBRID, 80, 1032, 81);
        Car car2 = new Car("Dodge", "RAM", Type.DIESEL, 160, 3255, 264);
        Car car3 = new Car("Tesla", "3", Type.ELEKTRO, 103, 1927, 239);
        Car car4 = new Car("Mazda", "2G", Type.GASOLINE, 80, 1100, 85);
//        List<Car> cars = new ArrayList<>();
//        cars.add(car1);
//        cars.add(car2);
//        cars.add(car3);
//        cars.add(car4);

        // menu

        System.out.println(
                "__________________________\n" +
                        "Welcome to the simulation!\n" +
                        "chose your car:"
        );
        System.out.println("[1] " + car1);
        System.out.println("[2] " + car2);
        System.out.println("[3] " + car3);
        System.out.println("[4] " + car4);

        int carInput = uI();

        System.out.println("Wie lange ist die Strecke?");
        int length = uI();

        switch (carInput) {
            case 1 -> System.out.println(car1.drive(length) + " Liter Sprit übrig.");

            case 2 -> System.out.println(car2.drive(length) + " Liter Sprit übrig.");

            case 3 -> System.out.println(car3.drive(length) + " kWh übrig.");

            case 4 -> System.out.println(car4.drive(length) + " Liter Sprit übrig.");

        }
        ;


    }

    private static int uI() {
        Scanner uI = new Scanner(System.in);
        return uI.nextInt();
    }
}

