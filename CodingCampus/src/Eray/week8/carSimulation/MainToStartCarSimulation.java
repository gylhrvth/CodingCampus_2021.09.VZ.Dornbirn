package Eray.week8.carSimulation;

import java.util.Scanner;

public class MainToStartCarSimulation {
    public static void main(String[] args) {
        printAll();
    }

    static Scanner scanner = new Scanner(System.in);
    private final static CarDatas car = new CarDatas("Mercedes", "C63 AMG", "Benziner", 1725, 70.00, 375);

    public static void printAll() {


        //Tank inhalt dividieren durch den Verbrauch auf 100 Liter
        double tankVerbrauch = car.getTankInhalt() / 14.00;
        double streckeDieDerTankAushaltet = tankVerbrauch * 100;

        //Programm funktioniert aber die exakte tankberechnung für den kilometer stimmt noch nicht gantz genau

        System.out.println(car);
        System.out.println();

        boolean driving = true;
        while (driving) {
            System.out.println();
            System.out.println("Zum aufhören zum Fahren drücken sie [1]");
            System.out.println("Gebe ein wie viele Kilometer du mit deinem " + car.getHersteller() + " " + car.getModell() + " fahren willst");
            System.out.println();
            int kilometer = scanner.nextInt();

            if (kilometer == 1) {
                driving = false;
                System.out.println("Du hast das Auto erfolgreich abgestellt!");
            } else {

                double fehlendeRestKilometer = driveCarIfTankIsSufficient(kilometer, streckeDieDerTankAushaltet);


                if (fehlendeRestKilometer < 0) {
                    System.out.println("Leider hat der Tank nicht ausgereicht, Es fehlen noch " + fehlendeRestKilometer + " KM bitte tanken sie!");
                    System.out.println("Möchtest du Tanken wenn ja drücke [+]");
                    System.out.println("Ansonsten drücke                  [-]");

                    String userInput = scanner.next();
                    switch (userInput) {
                        case "+" -> fillTank(fehlendeRestKilometer);
                        case "-" -> System.out.println("Da du nicht Tanken willst bleibt das Auto stehen du hast erfolgreich" + streckeDieDerTankAushaltet + " KM gefahren");


                    }

                }
            }


        }
    }


    public static double driveCarIfTankIsSufficient(int kilometer, double streckeDieDerTankAushaltet) {
        if (kilometer < streckeDieDerTankAushaltet) {
            System.out.println("Du bist erfolgreich " + kilometer + " Kilometer gefahren du hast noch " + (streckeDieDerTankAushaltet - kilometer) + " Kilometer Resttank");
        }
        return streckeDieDerTankAushaltet - kilometer;
    }

    public static void fillTank(double fehlendeRestKilometer) {
        double benzinPreis = 1.47;
        double maxTank = car.getTankInhalt() * benzinPreis;

        // 70 liter gesamt Tank pro 100 km brauche ich 14 Liter Tank
        // Insgesamt sind das 500 km die ich mit dem Auto zurücklegen kann
        // 14 / 100 = 0,14;
        // 0,14 liter verbrauch pro 1km
        // 0,14 liter * 100 = 14 Liter mit 14 Liter kann ich 100 km Fahren
        // Wie oft passt 14 Liter in ein 70Liter Tank = 5 mal
        // Das heißt wenn ich pro 14 Liter 100 km zurücklegen kann und 14 Liter 5 mal in ein Volltank passt lege ich insgesamt
        // 500 Kilometer zurück

        double fehlenderTankInhaltInLiter = ((fehlendeRestKilometer * 0.14) * benzinPreis);

        System.out.println("Der aktuelle Benzin Spritpreis liegt bei 1.47€");
        System.out.printf("Ein erneuter Volltank kostet insgesamt %.2f € Um dies zu machen drücke [1]", maxTank);
        System.out.println();
        System.out.printf("Ein tank der genau für die restliche Strecke reicht kostet %.2f € Um dies zu machen drücke [2]", fehlenderTankInhaltInLiter);
        int userInputNumber = scanner.nextInt();
        if (userInputNumber == 1) {
            car.setTankInhalt(70.00);
            System.out.println("Du hast erfolgreich vollgetankt aktueller Tankstand " + ((car.getTankInhalt() / 14) * 100) + " Kilometer");
        } else if (userInputNumber == 2) {
            double ausreichendTanken = (fehlendeRestKilometer / 14.00) * 100;
            car.setTankInhalt(ausreichendTanken);
            System.out.println("Du hast erfolgreich ausreichen getankt aktueller Tankstand " + ausreichendTanken + " Kilometer");
        }

    }
}