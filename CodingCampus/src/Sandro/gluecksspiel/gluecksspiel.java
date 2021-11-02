package Sandro.gluecksspiel;

import java.util.Random;
import java.util.Scanner;

public class gluecksspiel {

    public static void main(String[] args) {

        /**
         * https://wiki.freitagsrunde.org/Javakurs/%C3%9Cbungsaufgaben/Gl%C3%BCcksspiel
         * Aufgabe
         */

        personen p1 = new personen(18, "Peter", true);
        personen p2 = new personen(18, "Lisa", false);
        personen[] personenListe = new personen[2];
        personenListe[0] = p1;
        personenListe[1] = p2;

        System.out.println();
        genderCheck(p1, p2);
        gamblingGame(p1, p2);
    }

    public static void genderCheck(personen p1, personen p2) {

        if (p1.alter < 18 && p1.genderMale) {
            System.out.println("Guten Tag junger Mann " + " " + p1.name + " " + p1.alter);
        }
        if (p1.alter >= 18 && p1.genderMale) {
            System.out.println("Guten Tag erwachsener Mann" + " " + p1.name + " " + p1.alter);
        }
        if (p2.alter < 18 && !p2.genderMale) {
            System.out.println("Guten Tag junge Frau" + " " + p2.name + " " + p2.alter);
        }
        if (p2.alter >= 18 && !p2.genderMale) {
            System.out.println("Guten Tag erwachsene Frau" + " " + p2.name + " " + p2.alter);
        }
    }

    public static void gamblingGame(personen p1, personen p2) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100);
        int valuationPlayer1 = 0;
        int valuationPlayer2 = 0;

        System.out.println(p1.name + " bitte geben Sie Ihre Schätzung ein. Die Schätzug muss im Bereich 0-100 sein:");
        valuationPlayer1 = scanner.nextInt();
        System.out.println(p2.name + " Bitte geben Sie Ihre Schätzung ein. Die Schätzug muss im Bereich 0-100 sein:");
        valuationPlayer2 = scanner.nextInt();

        int spacingOne = Math.abs(valuationPlayer1 - randomNumber);
        int spacingTwo = Math.abs(valuationPlayer2 - randomNumber);

        if (spacingOne < spacingTwo) {
            System.out.println("Spieler Eins hat gewonnen!");
        } else if (spacingOne > spacingTwo) {
            System.out.println("Spieler Zwei hat gewonnen!");
        } else {
            System.out.println("Unentschieden!");
        }
        System.out.println(randomNumber);
    }
}

