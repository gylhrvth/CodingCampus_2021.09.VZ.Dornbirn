package Stefan.Week3;

import java.awt.*;
import java.util.Scanner;

public class Wuerfelspiel {

    public static void main(String[] args) {

        würfelspiel();

    }
    static Scanner eingabe () {
        return new Scanner (System.in);
    }

    static void neurechnen () {

        String neu = "j";
        String ende = "n";

        System.out.println("Eine neue Runde? [j/n]");
        String a = eingabe().next();

        while (true)  {

            if (neu.equalsIgnoreCase(a)) {
                System.out.println("Ich freue mich auf eine neue Runde mit Ihnen.");
                würfelspiel();
                break;
            }else if (ende.equalsIgnoreCase(a)) {
                System.out.println("Auf Wiedersehen!");
            }
            System.exit(0);
        }
    }

    static void würfelspiel () {

        int x , y;
        Toolkit fehlersound = java.awt.Toolkit.getDefaultToolkit();

        x = (int) (Math.random () * 7);
        y = (int) (Math.random () * 7);

        if ( x == y ) {
            System.out.println("Zahl_1: " + x);
            System.out.println("Zahl_2: " + y);
            System.out.println("");
            System.out.println("Gleichstand!");
            neurechnen();
        }else if ( x < y ) {
            System.out.println("Ihre Zahl: " + x);
            System.out.println("Meine Zahl: " + y);
            System.out.println("");
            System.out.println("Ich habe gewonnen!");
            neurechnen();
        }else if ( x > y ) {
            System.out.println("Ihre Zahl: " + x);
            System.out.println("Meine Zahl: " + y);
            System.out.println("");
            System.out.println("Sie haben gewonnen!");
            neurechnen();
        }else {
            fehlersound.beep();
            System.err.println("Ein unbekannter Fehler ist aufgetreten!");
            neurechnen();
        }
    }
}
