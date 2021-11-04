package Sandro.konstruktor;

import Sandro.konstruktor.Hund;

public class Konstruktor {

    public static void main(String[] args) {

        Hund laprador = new Hund (3,"laprador","hellbraun",true);
        Hund dackerl = new Hund(9, "Dackel", "braun", false);
        Hund mops = new Hund(3, "Mops", "weiß", true);
        Hund schaeferhund = new Hund(4, "Schäferhund", "dunkelbraun", true, true);
        Hund[] hunde = {laprador, dackerl, mops, schaeferhund};

        // Arten Hunde abfragen
        for (int i = 0; i < hunde.length; i++) {
            System.out.println(hunde[i].art);
        }
        System.out.println();

        // Fellfarbe Hunde abfragen
        for (int i = 0; i < hunde.length; i++) {
            System.out.println(hunde[i].fellfarbe);
        }

        // Anzahl Hunde (Pfote geben)
        int counter1 = 0;
        for (int i = 0; i < hunde.length; i++) {
            if (hunde[i].kannPfotegeben) {
                counter1++;
            }
        }
        System.out.println("\n" + "Wieviele Hunde können Pfote geben? : " + "\n" + counter1);

        // Anzahl Hunde (Kann bellen)
        int counter2 = 0;
        for (int i = 0; i < hunde.length; i++) {
            if (hunde[i].kannbellen) {
                counter2++;
            }
        }
        System.out.println("\n" + "Wieviele Hunde können bellen? : " + "\n" + counter2);
    }
}