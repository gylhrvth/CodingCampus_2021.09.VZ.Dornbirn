package Plamena.week9.Car;

import java.util.Scanner;

public class GasStation {
    private static Scanner sc = new Scanner(System.in);
    private double availableFuelToTank = 500.0;


    public void filltank(Car car) {
        System.out.println("How much do you want to tank?");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            sc.next();
        }
        int tmp = sc.nextInt();
        boolean filling = true;
        while(filling) {
            if (availableFuelToTank > tmp && tmp > 0 && tmp <= car.getTank().getMaxVolume() - car.getTank().getFuelStand()) {
                car.getTank().setFuelStand((car.getTank().getFuelStand() + (double) tmp));
                setAvailableFuelToTank(availableFuelToTank - tmp);
                System.out.println(tmp + " liter fuel tanked. Have a nice trip!");
                filling = false;
            } else {
                System.out.println("Selected amount not available! Please select a smaller amount or drive to the next gas station!");
            }
        }
    }

    public void setAvailableFuelToTank(double availableFuelToTank) {
        this.availableFuelToTank = availableFuelToTank;
    }
}
