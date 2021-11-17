package Eray.week8.carSimulation.aufgabe2;


import java.util.Random;
import java.util.Scanner;

public class MotorSubClass extends CarDatasAufgabe2 {

    static Scanner scanner = new Scanner(System.in);

    public MotorSubClass(String hersteller, String modell, String antriebsArt, String motor, int gewicht, double tankInhalt, int kiloWatt) {
        super(hersteller, modell, antriebsArt, motor, gewicht, tankInhalt, kiloWatt);

    }


    public void selfRepairingCar() {
        System.out.println("Das Auto wurde erfolgreich repariert viel Erfolg bei der Weiterfahrt");
    }

    public void aeroDynamicCar(Tank tank) {
        System.out.println("Das Auto wurde erfolgreich repariert und du hast den halben Verbrauch!");
        tank.setTankVerbrauch(tank.getTankVerbrauch() / 2);

    }

    static Random random = new Random();

    public void crapCar() {
        System.out.println("Okay du hast echt mut das Auto kann jederzeit kaputt gehen");
        int rndNumber = random.nextInt(3);

        if(rndNumber == 0){
            System.out.println("Oh Nein du hast es riskiert und es hat sich herausgestellt das der Motor kaputt ist und Treibstoff verliert");
            System.out.println("Leider können sie nicht mehr weiterfahren!");
            super.setTankInhalt(0.00);
        }
    }


}
