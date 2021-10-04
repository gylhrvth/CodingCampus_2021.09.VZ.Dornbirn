package Rauan.woche3.Array;

import java.util.Scanner;

public class ArrayTest2 {


    public static void main(String[] args) {
        //Leichte Aufgabe zum Aufwärmen
        //Eine Zeile aus der Kommandozeile einlesen
        //Zeile ausgeben
        //Zeile in Character Array verwandeln
        //Variante a) Direkt umgedreht ausgeben
        //Variante b) Umdrehen mithilfe eines Strings -> String ausgeben
        //Variante c) Umdrehen mithilfe eines neuen Character Arrays -> Character Array in String umwandeln und ausgeben
        //Variante d) Umdrehen im bestehenden Array des Inputs -> Character Array in String umwandeln und ausgeben
        //Lukas Array Aufgabe

        Scanner scanner = new Scanner(System.in);
        System.out.println("bitte geben sie ein satz ein");
        String input = scanner.nextLine();
        System.out.println("sie satz ist:" + input);
        char[] letters = input.toCharArray();
        char[] myArray = input.toCharArray();
        for (int myChar : myArray) {
            System.out.println(myChar);

        }

        //variante A
        System.out.println("variante A");
        printreverse(letters);

        //variante B
        System.out.println("variante B");
        String output = reverseString(letters);
        System.out.println(output);


    }


    public static void printreverse(char[] letters) {
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
}



