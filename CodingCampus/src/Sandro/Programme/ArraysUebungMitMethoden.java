package Sandro.Programme;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUebungMitMethoden {
    //Leichte Aufgabe zum Aufwärmen
    //Eine Zeile aus der Kommandozeile einlesen
    //Zeile ausgeben
    //Zeile in Character Array verwandeln
    //Variante a) Direkt umgedreht ausgeben
    //Variante b) Umdrehen mithilfe eines Strings -> String ausgeben
    //Variante c) Umdrehen mithilfe eines neuen Character Arrays -> Character Array in String umwandeln und ausgeben
    //Variante d) Umdrehen im bestehenden Array des Inputs -> Character Array in String umwandeln und ausgeben

    public static void main(String[] args) {

        System.out.println();

        //Eine Zeile aus der Kommandozeile einlesen
        System.out.println("Geben Sie einen Namen ein:");
        String line = scanner();

        //Zeile in Character Array verwandeln
        System.out.println("Zeile ausgeben: " + line);
        char[] newCharArray = line.toCharArray();

        System.out.println("Zeile in Character Array verwandeln Datentyp Char []: ");
        Arrays.toString(newCharArray);

        System.out.print("Variante a: ");
        reverseFormat(newCharArray);

        System.out.println();

        System.out.println("Variante b: " + charToStringKlasse(newCharArray));

        System.out.println("Variante c: " + reverseStringWithNewArray(newCharArray));

    }


    public static String reverseStringWithNewArray(char[] newCharArray) {

        char[] temp = new char[newCharArray.length];
        for (int i = 0; i < newCharArray.length; i++) {
            temp[i] = newCharArray[i];
        }
        String reverseString = new String(temp);
        return reverseString;
    }


    public static String charToStringKlasse(char[] newCharArray) {

        String name = "";

        for (int i = 0; i < newCharArray.length; i++) {
            name += newCharArray[i];
        }
        return name;
    }

    public static void reverseFormat(char[] newCharArray) {

        for (int i = newCharArray.length - 1; i >= 0; i--) {
            System.out.print(newCharArray[i]);
        }
    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void countLetter(char[] newCharArray) {


    }
}


