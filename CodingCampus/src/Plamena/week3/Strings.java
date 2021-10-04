package Plamena.week3;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
//3)
        //Schlaue Menge
        //Lies dir folgendes durch:
        //https://www.brandeins.de/magazine/brand-eins-wirtschaftsmagazin/2005/die-mitte/schlaue-menge
        //Entwickle ein Program welches zuerst fragt, wieviele Teilnehmer beim Expirement mitmachen
        //erstelle ein Array in der größe der Teilnehmer, der Typ des Arrays soll Float sein.
        //Frage jeden Teilnehmer nach seiner Schätzung.
        //Am Ende berechne den Durchschnitt (arithmetisches Mittel) aller Werte und gib diesen aus.



    }

    public static void letterCount (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your statement");
        String input = sc.next();

        String inputLowerCases = input.toLowerCase();
        char[] inputToNumbers = inputLowerCases.toCharArray();
        int[] letters = new int[26];

        for (int i = 0; i < inputToNumbers.length; i++) {
            char character = inputToNumbers[i];
            int letterIdx = character - 97;
            if (letterIdx >= 0 && letterIdx < letters.length) {
                letters[letterIdx]++;
            }
        }

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0)
                System.out.println("There are " + letters[i] + " " + ((char) +(i + 97)) + " in your statement");
        }

    }

    public static void printReverseInputWithString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your statement");
        String input = sc.next();
        char[] inputToCharArray = input.toCharArray();

        String reverse = "";
        for (int i = inputToCharArray.length - 1; i >= 0; i--) {
            reverse += inputToCharArray[i];
        }
        System.out.println(reverse);
    }

    public static void printReverseInputStringBuilder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your statement");
        String input = sc.next();
        System.out.println(input);
        char[] inputToCharArray = input.toCharArray();
        char[] inputReversion = new char[inputToCharArray.length];

        for (int i = inputToCharArray.length - 1; i >= 0; i--) {
            inputReversion[inputToCharArray.length - (i + 1)] = inputToCharArray[i];
        }

        System.out.println(inputReversion);
    }

    public static void reverseInputCharString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your statement");
        String input = sc.next();
        System.out.println(input);
        StringBuilder reverseInput = new StringBuilder();

        char[] inputToCharArray = input.toCharArray();

        for (int i = inputToCharArray.length - 1; i >= 0; i--) {
            reverseInput.append(input.charAt(i));
        }

        System.out.println(reverseInput);
    }
}
