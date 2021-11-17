package Eray.week8andweek9.carSimulation.aufgabe2;


import java.util.Random;
import java.util.Scanner;

public class MainToStartCarSimulationAufgabe2 {
    public static void main(String[] args) {
        printAll();
    }

    static Scanner scanner = new Scanner(System.in);

    static Random random = new Random();

    private static final CarDatasAufgabe2 car = new CarDatasAufgabe2("Mercedes", "C63 AMG", "Benziner", "V8 6.2 Liter", 1725, 70.00, 375);

    private static final MotorSubClass motor = new MotorSubClass("Mercedes", "C63 AMG", "Benziner", "V8 6.2 Liter", 1725, 70.00, 375);

    private static final Tank tankInhalt = new Tank("Mercedes", "C63 AMG", "Benziner", "V8 6.2 Liter", 1725, 70.00, 375);

    public static void printAll() {


        //Tank inhalt dividieren durch den Verbrauch auf 100 Liter
        double tankVerbrauch = car.getTankInhalt() / tankInhalt.getTankVerbrauch();
        double streckeDieDerTankAushaltet = tankVerbrauch * 100;


        System.out.println(car);
        int kilometer = 0;
        int gesamtKilometerDieGefahrenWurden = 0;
        double maxTankInhaltInLiter = 70.00;

        boolean driving = true;
        while (driving) {
            gesamtKilometerDieGefahrenWurden += kilometer;


            System.out.println();
            System.out.println("Zum Fahren drücken sie              [1]");
            System.out.println("Zum Tanken drücken sie              [2]");
            System.out.println("Zum in die Werkstatt fahren         [3]");
            System.out.println("Zum aufhören zum Fahren drücken sie [4]");
            System.out.println();
            System.out.printf("Sie haben aktuell {%.2f} Liter im Tank || FALLS du 0 Liter im Tank hast musst du zuerst Tanken!\n", car.getTankInhalt());
            System.out.println("Sie sind insgesamt schon " + gesamtKilometerDieGefahrenWurden + " KM gefahren");
            System.out.println();
            int userInput = scanner.nextInt();

            if (gesamtKilometerDieGefahrenWurden == 800 || gesamtKilometerDieGefahrenWurden == 1200) {
                System.out.println("Das Auto ist Defekt!!!!!!! Dies sind deine Optionen!");
                userInput = 3;
            }

            switch (userInput) {
                case 1:
                    System.out.println("---------------Menü Fahren------------------");

                    while (car.getTankInhalt() == 0.00) {
                        System.out.println("Sie müssen Tanken um fahren zu können!");
                        GasStation.mainToStartGasStation(streckeDieDerTankAushaltet, car);
                    }

                    System.out.println();
                    System.out.println("Geben sie ein Wie viel Kilometer sie fahren wollen!");
                    kilometer = scanner.nextInt();
                    System.out.println("Sie sind erfolgreich " + kilometer + " Kilometer gefahren!");

                    double restTank = car.getTankInhalt() - (kilometer * 0.14);
                    car.setTankInhalt(restTank);

                    System.out.println("---------------Menü Fahren Ende-------------");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("--------------Menü Tanken-------------------");
                    System.out.println();
                    System.out.println("Aktuell sind " + car.getTankInhalt() + " Liter im Tank");
                    GasStation.mainToStartGasStation(streckeDieDerTankAushaltet, car);
                    System.out.println("-------------Menü Tanken Ende---------------");
                    System.out.println();
                    break;

                case 3:
                    RepairStation.mainToStartRepairStation(motor, tankInhalt);
                    break;

                case 4:
                    driving = false;
                    System.out.println("Sie haben das Auto erfolgreich abgestellt!");
                    break;
            }


        }
    }


}
