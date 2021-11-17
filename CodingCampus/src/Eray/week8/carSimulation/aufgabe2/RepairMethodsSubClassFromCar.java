package Eray.week8.carSimulation.aufgabe2;

public class RepairMethodsSubClassFromCar extends CarDatasAufgabe2 {


    public RepairMethodsSubClassFromCar(String hersteller, String modell, String antriebsArt, String motor, int gewicht, double tankInhalt, int kiloWatt) {
        super(hersteller, modell, antriebsArt, motor, gewicht, tankInhalt, kiloWatt);

        double aktuellerTankInhalt = getTankInhalt();
    }


    public static void selfRepairingCar() {

    }

    public static void aeroDynamicCar() {
        System.out.println("Du kannst weiterfahren ohne in die Werkstatt zu gehen aber du hast 50% weniger Treibstoff");

    }

    public static void crapCar() {

    }

}
