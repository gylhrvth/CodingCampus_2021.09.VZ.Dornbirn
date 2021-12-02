package Mahir.strukturierteProgrammierung.week3;

//Eine Zeile aus der Kommandozeile einlesen
//Zeile ausgeben
//Zeile in Character Array verwandeln und umdrehen
//Umgedrehte Zeile ausgeben

//Variante a) Direkt umgedreht ausgeben
//Variante b) Umdrehen mithilfe eines Strings -> String ausgeben
//Variante c) Umdrehen mithilfe eines neuen Character Arrays -> Character Array in String umwandeln und ausgeben
//Variante d) Umdrehen im bestehenden Array des Inputs -> Character Array in String umwandeln und ausgeben

//2)
//Text aus Kommandozeile einlesen
//Buchstaben case insensitive Zählen (A zählt für a)
//und ausgeben wie oft jeder Buchstabe vorkommt
//TIP aus einem Character kann man eine Zahl gewinnen, bzw. man kann diesen als Zahl annehmen

import java.util.Scanner;

public class Day4Arrays {
    public static void main(String[] args) {
        System.out.println("Please enter a text");

        String line = readLine();

        System.out.println(line);

        char[] letters = line.toCharArray();


//Variante a) Direkt umgedreht ausgeben
        System.out.println("Variante a");
        reverse(letters);

//Variante b) Umdrehen mithilfe eines Strings -> String ausgeben
        System.out.println("Variante b");
        System.out.println(reverseString(letters));
//Variante c) Umdrehen mithilfe eines neuen Character Arrays -> Character Array in String umwandeln und ausgeben
        System.out.println("Variante c");
        System.out.println(reverseChar(letters));
//Variante d) Umdrehen im bestehenden Array des Inputs -> Character Array in String umwandeln und ausgeben
        System.out.println("Variante d");
        reverseStringInPlaces(letters);

    }


    public static String readLine() {
        Scanner scanneer = new Scanner(System.in);
        return scanneer.nextLine();
    }

    public static void reverse(char[] letters) {
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.println();
    }

    public static String reverseString(char[] letters) {
        String tmp = "";
        for (int i = letters.length - 1; i >= 0; i--) {
            tmp += letters[i];
        }
        return tmp;
    }

    public static String reverseChar(char[] letters) {
        char[] tmp = new char[letters.length];
        int counter = 0;
        for (int i = letters.length - 1; i >= 0; i--) {
            tmp[counter] = letters[i];
            counter++;
        }
        return new String(tmp);
    }

    public static void reverseStringInPlaces(char[] letters) {
        if (letters == null || letters.length < 2) {
            return;
        }
        for (int i = 0; i < letters.length / 2; i++) {
            char temp = letters[i];
            letters[i] = letters[letters.length - 1 - i];
            letters[letters.length - 1 - i] = temp;

        }
        System.out.println(letters);

    }
}







