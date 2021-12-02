package Bartosz.oop.exercise4;

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
        Car selectedCar = car1;

        switch (carInput) {
            case 1 -> {
                int currentTank = selectedCar.leftForFuel(selectedCar, length);// berechnet wie viel Sprit übrig ist.

                do {
                    firstStop(selectedCar, currentTank);  //gibt aus wie viel sprit übrig ist, wie weit man damit kommt und Userabfrage Tanken
                    int refuel = uI();  //User Input ja / nein

                    // If Else refuel ja / nein
                    if (refuel == 1) {
                        currentTank = refueledTo_uI(selectedCar, currentTank);
                    }
                    else {
                        int tmp = calcKmLeft(selectedCar,currentTank);
                        System.out.println("Sie sollten innerhalb der nächsten [" + tmp +"] Km tanken!");
                    }

                    System.out.println("Wollen Sie weiterfahren?");
                    int tmp = uI();

                } while (currentTank > 0);
            }

            case 2 -> {
                selectedCar = car2;
                int leftoverFuel = selectedCar.leftForFuel(selectedCar, length);
                ;// berechnet wie viel Sprit übrig ist.
                firstStop(car2, leftoverFuel);

                int refuelInput = uI();

            }

            case 3 -> {
                selectedCar = car3;
                int leftoverFuel = car3.drive(length);
                System.out.println(car3.drive(length) + " kWh übrig.");
                firstStop(car3, leftoverFuel);

                int refuelInput = uI();
            }

            case 4 -> {
                selectedCar = car4;
                int leftoverFuel = car4.drive(length);
                System.out.println(car4.drive(length) + " Liter Sprit übrig.");
                firstStop(car4, leftoverFuel);

                int refuelInput = uI();
            }

        }


    }

    // User Input
    private static int uI() {
        Scanner uI = new Scanner(System.in);
        return uI.nextInt();
    }

    // User Input wie viel getankt werden soll
    private static int refueledTo_uI(Car selectedCar, int leftoverFuel) {
        System.out.println("Wie viel möchten Sie tanken? max. [" + (selectedCar.getTankCap()-leftoverFuel) +"] L");
        int tmp = uI();
        int refueledTank =0;
        if(tmp > selectedCar.getTankCap()-leftoverFuel){
            System.out.println("Ihr Auto wurde voll aufgetankt.");
            refueledTank = selectedCar.getTankCap();
        }
        else {
            refueledTank = (selectedCar.getTankCap()-leftoverFuel) + tmp;
        }

        return refueledTank;
    }

    // Calculates how far you get with the rest of your Fuel
    private static int calcKmLeft(Car car, int leftOverFuel) {
        return car.leftForKM(leftOverFuel);
    }

    // 1st Stop
    private static void firstStop(Car car, int leftoverFuel) {
        System.out.println(leftoverFuel + " Liter Sprit übrig.");   // Tankstand
        calcKmLeft(car, leftoverFuel);     // wie weit kommt man noch ohne zu tanken.
        System.out.println();
        System.out.println("Möchten Sie tanken? \n[1] Ja \n[2] Nein");
        int tanken = uI();
    }
}

