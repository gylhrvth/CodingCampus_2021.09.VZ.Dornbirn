package Plamena.week9.Car;

import java.util.Scanner;

public class AutomatedDriving {
    private static Scanner sc = new Scanner(System.in);
    Car car;
    GasStation gs;

    public static void main(String[] args) {
        Car car = new Car("Volvo", "Z1", 110, 1250);
        GasStation gs = new GasStation();
        car.setTank(new Tank(50.5, 60));
        int distance = 600;
        int distanceLeft = distance;


        do {
            distanceLeft -= (int) car.drive(distanceLeft);
            System.out.println(distanceLeft + "km left.");
            askIfFillTank(car, gs);
        } while (distanceLeft >= 0);
    }

    public static void askIfFillTank(Car car, GasStation gs) {
        System.out.println("Not enough fuel for the selected distance");
        System.out.println("If you want to fill the tank enter FILL");
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("fill")) {
            gs.filltank(car);
        }
    }


}
