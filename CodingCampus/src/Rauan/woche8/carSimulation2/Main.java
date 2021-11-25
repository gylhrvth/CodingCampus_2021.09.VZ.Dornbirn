package Rauan.woche8.carSimulation2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    printAll();

    }
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    private static final DataCar car = new DataCar("Toyota"," Es4 Amg","Benzin",70.00,
            1664,355,"V6  3.2 Liter");
    private static final Motor motor = new Motor("Mercedes", "C45 AMG","Benzin",
            "V4 2.2 Liter",69.00,1400,344);
    private static final Tank tankInhalt = new Tank("Toyota","C63 Amg","Benzin",70.00,
            "V8 5.2 Liter",1300, 345);


    public static void  printAll(){
        double tankVerbrauch = car.getTankInhalt()/ tankInhalt.getTankVerbrauch();
        double diArtDerTankUmgehenKann = tankVerbrauch*100;

        System.out.println(car);
        int kiloMeter =0;
        int alleKilometerDieGefahrenWurde =0;
        double maxTAnkInhaltLiter =70.00;

        boolean driving = true;
        while (driving){
            System.out.println();
            System.out.println("zum fahren drücken sie   [1]");
            System.out.println("zum tanken drücken sie   [2]");
            System.out.println("zum Werkstatt fahren drücken Sie  [3]");
            System.out.println("zum aufhören des fahren drücken sie  [4]");
            System.out.println();
            System.out.println("Sie haben aktuell %.2f Liter im Tank, falls du 0 L hast, musst du tanken \n"+car.getTankInhalt());
            System.out.println("Sie sind ingesamt"+ alleKilometerDieGefahrenWurde+ "KM gefahren");
            System.out.println();
            int input = scanner.nextInt();

            if (alleKilometerDieGefahrenWurde == 800 || alleKilometerDieGefahrenWurde ==1100){
                System.out.println("Das Auto ist defekt");
                input=3;
            }
            switch (input){
                case 1:
                    System.out.println("---Menü Fahren...");

                    while (car.getTankInhalt() ==0.00){
                        System.out.println("Sie müssen tanken um fahren zu können");
                        GasStation.toStarGasStation(diArtDerTankUmgehenKann, car);
                    }
                    System.out.println();
                    System.out.println("Geben sie wie viele KM fahren wollen");
                    kiloMeter = scanner.nextInt();
                    System.out.println("Sie sind erfolgreich"+ kiloMeter+ "kilometer gefahren");

                    double restTank = car.getTankInhalt()- (kiloMeter*0.14);
                    car.setTankInhalt(restTank);
                    System.out.println("...Menü Fahre Ende...");
                    System.out.println();
                    break;

                case 2:
                    System.out.println(".....Menü Tanken..");
                    System.out.println();
                    System.out.println("akteuell sind"+ car.getTankInhalt()+ "Liter im tank");
                    GasStation.toStarGasStation(diArtDerTankUmgehenKann, car);
                    System.out.println("...Menü Tanken Ende...");
                    System.out.println();
                    break;

                case 3:
                    RepairStation.toStartRepairStation(motor, tankInhalt);

                case 4:
                    driving=false;
                    System.out.println("Sie haben das Auto gestoppt");
                    break;

            }
        }
    }
}
