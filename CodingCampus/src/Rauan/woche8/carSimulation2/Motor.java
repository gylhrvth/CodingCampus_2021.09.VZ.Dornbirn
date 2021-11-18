package Rauan.woche8.carSimulation2;

import java.util.Random;
import java.util.Scanner;

public class Motor {

    static Scanner scanner = new Scanner(System.in);
    private Tank tank;

    public Motor(String hersteller, String modell, String antriebsArt, String motor, double tankInhalt, int gewicht,
                 int kilowatt){

    }
    public void selbRepair() {
        System.out.println("Das Auto wurde repariert, weiterfahren");
    }

    public void AreoDynamic() {
        System.out.println("Das Auto wurde repariert und du hast den halben verbraucht");
        tank.setTankVerbrauch(tank.getTankVerbrauch() / 2);
    }


    static Random random = new Random();
    public void badCar() {
        System.out.println("Das Auto kann Jede Zeit kaputt gehen");
        int rndNummer = random.nextInt(4);

        if (rndNummer ==0){
            System.out.println("Der Motor ist außer Betrieb und verliert Kraftstoff");
            System.out.println("Sie können nicht weiterfahren");

        }
    }
}
