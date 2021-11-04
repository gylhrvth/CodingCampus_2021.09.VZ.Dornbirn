package Mahir.strukturierteProgrammierung.week3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//3)
//Schlaue Menge
//Lies dir folgendes durch:
//https://www.brandeins.de/magazine/brand-eins-wirtschaftsmagazin/2005/die-mitte/schlaue-menge
//Entwickle ein Program welches zuerst fragt, wieviele Teilnehmer beim Expirement mitmachen
//erstelle ein Array in der größe der Teilnehmer, der Typ des Arrays soll Float sein.
//Frage jeden Teilnehmer nach seiner Schätzung.
//Am Ende berechne den Durchschnitt (arithmetisches Mittel) aller Werte und gib diesen aus.


public class ArrayAufgabe3und4 {
    public static void main(String[] args) {

        //2)
        //Text aus Kommandozeile einlesen
        //Buchstaben case insensitive Zählen (A zählt für a)
        //und ausgeben wie oft jeder Buchstabe vorkommt
        //TIP aus einem Character kann man eine Zahl gewinnen, bzw. man kann diesen als Zahl annehmen

        countChars();


        //3)
        //Schlaue Menge
        //Lies dir folgendes durch:
        //https://www.brandeins.de/magazine/brand-eins-wirtschaftsmagazin/2005/die-mitte/schlaue-menge
        //Entwickle ein Program welches zuerst fragt, wieviele Teilnehmer beim Expirement mitmachen
        //erstelle ein Array in der größe der Teilnehmer, der Typ des Arrays soll Float sein.
        //Frage jeden Teilnehmer nach seiner Schätzung.
        //Am Ende berechne den Durchschnitt (arithmetisches Mittel) aller Werte und gib diesen aus.

        int players = readInt();
        float[] playerGuesses = guesses(players);
        System.out.println("The average guess is " + averageGuess(playerGuesses));


    }

    public static int readInt() {
        System.out.println("Type the amount of Players");
        Scanner scanner = new Scanner(System.in);
        int amountOfPeople = scanner.nextInt();
        return amountOfPeople;
    }

    public static float[] guesses(int amoount) {
        float[] guesses = new float[amoount];
        for (int i = 0; i < amoount; i++) {
            System.out.println("Player " + i + " type in your guess");
            Scanner scanner = new Scanner(System.in);
            float guess = scanner.nextFloat();
            guesses[i] = guess;

        }
        System.out.println("the guesses are");
        System.out.println(Arrays.toString(guesses));
        System.out.println();
        return guesses;
    }

    public static float averageGuess(float[] guesses) {
        float summ = 0;
        for (int i = 0; i < guesses.length; i++) {
            summ += guesses[i];
        }
        float avarage = summ / guesses.length;
        return avarage;

    }

    public static void countChars() {
        System.out.println("Please enter a text to count the letters");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase(Locale.ROOT);
        char[] strArr;
        while (str.length() != 0) {
            strArr = str.toCharArray();
            char ch = strArr[0];
            int count = 1;
            for (int i = 1; i < strArr.length; i++) {
                if (ch == strArr[i]) {
                    count++;
                }
            }
            if (((ch != ' ') && (ch != '\t'))) {
                System.out.println(ch + " - " + count);
            }
            str = str.replace("" + ch, "");

        }
    }
}