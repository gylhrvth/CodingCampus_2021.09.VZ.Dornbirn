package Rauan.woche8.carSimulation2;

import java.util.Scanner;

public class GasStation {


    static Scanner scanner = new Scanner(System.in);

    public static void toStarGasStation(double dieArtDerTankUmgehenKann, DataCar car) {

        System.out.println("sorry, der Tank reicht nicht aus, bitte tanken sie");
        System.out.println(" wenn du tanken willst drück [+]");
        System.out.println("ansonsten drück [-");

        String input = scanner.next();
        switch (input){
            case "+" :
                fillTank(car);
            case "-":
                System.out.println("woolen sie nicht tanken , so bleibt das Auto stehen , du hast geschafft"
                + dieArtDerTankUmgehenKann);
        }

    }

    public static void fillTank(DataCar car) {
        double benzinPreis = 1.47;
        double maxTAnk = 70.00 * benzinPreis;


        System.out.println("Akteuell Benzin Preis 1.47€");
        System.out.printf("Ein erneuter Volltank kostet insgesamt %.2f € Um dies zu machen drücke [1]", maxTAnk);
        int inputNummer = scanner.nextInt();
        if (inputNummer == 1) {
            car.setTankInhalt(70.00);
            System.out.println("Du hast erfolgreich vollgatanket und akteueller TankStand ist" +
                    ((car.getTankInhalt() / 14) * 100) + "Kilometer");
        }
    }
}
