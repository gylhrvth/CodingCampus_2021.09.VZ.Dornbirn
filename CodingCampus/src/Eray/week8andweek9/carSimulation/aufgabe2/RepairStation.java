package Eray.week8andweek9.carSimulation.aufgabe2;

import java.util.Scanner;

public class RepairStation {

    static Scanner scanner = new Scanner(System.in);

    public static void mainToStartRepairStation(MotorSubClass motor, Tank tank) {
        System.out.println("UUUPS ich glaube wir haben ein Problem der Motor ist leider defekt");
        System.out.println("Diese Möglichkeiten gibt es das Auto zu reparieren");
        System.out.println("[1]     SelfRepairingCar (hat der Motor einen Schaden, so soll dieser automatisch repariert und weitergefahren werden)");
        System.out.println("[2]     AeroDynamicCar (reduziert den Treibstoffverbrauch um 50%)");
        System.out.println("[3]     CrapCar (erhöht die Wahrscheinlichkeit dass der Motor kaputt geht um 50%)");
        int userInputForRepairing = scanner.nextInt();

        switch (userInputForRepairing) {
            case 1:
                motor.selfRepairingCar();
                break;

            case 2:
                motor.aeroDynamicCar(tank);
                break;

            case 3:
                motor.crapCar();
                break;

            default:
                System.out.println("Bitte gebe eine richtige Zahl ein!");
                break;
        }
    }
}
