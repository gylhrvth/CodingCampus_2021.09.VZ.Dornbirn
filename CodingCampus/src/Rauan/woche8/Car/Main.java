package Rauan.woche8.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printAll();
    }

    static Scanner scan = new Scanner(System.in);
    private final static CarKlasse car = new CarKlasse("Mercedes", "EOS amg", 70.00, "Benzin", 1375,
            378);

    public static void printAll() {
        double tankVerbrauch = car.getTankinhalt() / 14.00;
        double SoKannDerTankUmgehen = tankVerbrauch * 100;
        System.out.println(car);
        System.out.println();

        boolean driving = true;
        while (driving) {
            System.out.println();
            System.out.println("Um Die Fahrt zu beenden, drücken Sie [1]");
            System.out.println("Geben Sie ein wie viele kilometer du mit deinem  " + car.getHersteller() + " " +
                    car.getModell() + " fahren willst");
            System.out.println();
            int kilometer = scan.nextInt();

            if (kilometer == 1) {
                driving = false;
                System.out.println("Sie haben das Auto erfolgreich gestoppt");
            } else {
                double fehlendeKiometer = fahrtAutoWennBenzinIstAusreichend(kilometer, SoKannDerTankUmgehen);

                if (fehlendeKiometer < 0) {
                    System.out.println("Der tank leider hat nicht ausgereicht" + fehlendeKiometer + "KM bitte tankem sie");
                    System.out.println("Wenn du tanken willst drück [+]");
                    System.out.println("Ansonsten drück  [-]");

                    String input = scan.next();
                    switch (input) {
                        case "+" -> fülleDenTank(fehlendeKiometer);
                        case "-" -> System.out.println("Da du nicht tanken willst, bleibt das Auto stehen, du hast es geschafft"
                                + SoKannDerTankUmgehen + "KM gefahren");
                    }
                }
            }
        }
    }

    public static double fahrtAutoWennBenzinIstAusreichend(int kilometer, double SoKannDerTankUmgehen) {
        if (kilometer < SoKannDerTankUmgehen) {
            System.out.println("Du bist Erfolgreich " + kilometer + " Kilometer gefahren du hast " +
                    (SoKannDerTankUmgehen - kilometer) + " Restkilometer des Tanks");
        }
        return SoKannDerTankUmgehen - kilometer;
    }

    public static void fülleDenTank(double fehlendeKilometer) {
        double benzinPreis = 1.47;
        double maxTank = car.getTankinhalt() * benzinPreis;

        double fehlendeTankInhaltLiter = ((fehlendeKilometer * 0.14) * benzinPreis);
        System.out.println("Der aktuelle Benzin Spritpreis liegt bei 1.47€");
        System.out.printf("Ein erneuter Volltank kostet insgesamt %.2f € Um dies zu machen drücke [1]", maxTank);
        System.out.println();
        System.out.printf("Ein tank der genau für die restliche Strecke reicht kostet %.2f € Um dies zu machen drücke [2]",
                fehlendeTankInhaltLiter);
        int userInputNumber = scan.nextInt();
        if (userInputNumber == 1) {
            car.setTankinhalt(70.00);
            System.out.println("Du hast erfolgreich vollgetankt aktueller Tankstand " + ((car.getTankinhalt() / 14) * 100) + " Kilometer");
        } else if (userInputNumber == 2) {
            double ausreichendTanken = (fehlendeKilometer / 14.00) * 100;
            car.setTankinhalt(ausreichendTanken);
            System.out.println("Du hast erfolgreich ausreichen getankt aktueller Tankstand " + ausreichendTanken + " Kilometer");
        }

    }
}
