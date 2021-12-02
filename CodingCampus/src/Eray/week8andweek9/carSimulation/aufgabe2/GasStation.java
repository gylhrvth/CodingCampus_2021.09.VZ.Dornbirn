package Eray.week8andweek9.carSimulation.aufgabe2;

import java.util.Scanner;

public class GasStation {
    static Scanner scanner = new Scanner(System.in);

    public static void mainToStartGasStation( double streckeDieDerTankAushaltet, CarDatasAufgabe2 car) {



        System.out.println("Leider reicht der Tank nicht aus, bitte tanken sie!");
        System.out.println("Möchtest du Tanken wenn ja drücke [+]");
        System.out.println("Ansonsten drücke                  [-]");

        String userInput = scanner.next();
        switch (userInput) {
            case "+" -> fillTank(car);
            case "-" -> System.out.println("Da du nicht Tanken willst bleibt das Auto stehen du hast erfolgreich" + streckeDieDerTankAushaltet + " KM gefahren");

        }

    }


    public static void fillTank(CarDatasAufgabe2 car) {
        double benzinPreis = 1.47;
        double maxTank = 70.00 * benzinPreis;


        System.out.println("Der aktuelle Benzin Spritpreis liegt bei 1.47€");
        System.out.printf("Ein erneuter Volltank kostet insgesamt %.2f € Um dies zu machen drücke [1]", maxTank);
        int userInputNumber = scanner.nextInt();
        if (userInputNumber == 1) {
            car.setTankInhalt(70.00);
            System.out.println("Du hast erfolgreich vollgetankt aktueller Tankstand " + ((car.getTankInhalt() / 14) * 100) + " Kilometer");
        }

    }
}
