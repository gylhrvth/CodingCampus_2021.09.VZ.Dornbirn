package Rauan.woche8.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printAll();
    }

    static Scanner scanner = new Scanner(System.in);
    private final static CarKlasse car = new CarKlasse("Nissan", "Eos 101",
            "Benzin", 68.0, 1600, 400);


    public static void printAll() {


    }

    public static double driveCarIfTankIsEnough(int kilometer, double sokannesumgehen) {
        if (kilometer < sokannesumgehen) {
            System.out.println("Du hast Erfolgreich " + kilometer + "gefahren und du hast noch " + (sokannesumgehen - kilometer) + "Restfahrt");
        }
        return sokannesumgehen - kilometer;
    }

    public static void fillTank(double fehlendeKilometer) {
        double benzinPreis = 1.47;
        double maxTank = car.getTankinhalt() * benzinPreis;
    }


}
