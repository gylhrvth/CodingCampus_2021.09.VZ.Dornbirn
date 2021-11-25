package Rauan.woche8.carSimulation2;

import java.util.Scanner;

public class RepairStation {

    static Scanner scanner = new Scanner(System.in);

    public static void toStartRepairStation(Motor motor, Tank tank){
        System.out.println("Unser Motor ist defekt");
        System.out.println("Möglich Auto zu reparieren");
        System.out.println("[1]  selbRepair : Motor defekt, es soll automatic reparieren");
        System.out.println("[2] AeroDynamic: reduziert des TankVerbrauch bis 50%");
        System.out.println("[3]  badCar: velleicht Motor kaputt um 50%");

        int inputZumRepair = scanner.nextInt();
        switch (inputZumRepair){
            case 1 :
                motor.selbRepair();
                break;
            case  2:
                motor.AreoDynamic();
                break;
            case 3 :
                motor.badCar();
                break;

            default:
                System.out.println("Bitte geben sie ein Zahl ein");
                break;
        }
    }
}
