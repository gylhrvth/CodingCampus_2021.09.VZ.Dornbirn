package Ingo.week3;

import java.util.Scanner;

public class arrayMethods {
    //Leichte Aufgabe zum Aufwärmen
    //Eine Zeile aus der Kommandozeile einlesen
    //Zeile ausgeben
    //Zeile in Character Array verwandeln
    //Variante a) Direkt umgedreht ausgeben
    //Variante b) Umdrehen mithilfe eines Strings -> String ausgeben
    //Variante c) Umdrehen mithilfe eines neuen Character Arrays -> Character Array in String umwandeln und ausgeben
    //Variante d) Umdrehen im bestehenden Array des Inputs -> Character Array in String umwandeln und ausgeben

    public static void main(String[] args) {
        System.out.println("Bitte geben Sie eine Zeile ein");

        String line = readLine();

        System.out.println("Ihre Eingabe war: " + line);

        char[] letters = line.toCharArray();

        //Variante a)
        System.out.println("Variante a)");
        printReverse(letters);

        //Variante b)
        System.out.println("Variante b)");
        //System.out.println(reverseString(letters));
        String output = reverseString(letters);
        System.out.println(output);

        //Variante c)
        System.out.println("Variante c)");
        System.out.println(reverseStringWithNewArray(letters));

        //Variante d)
        System.out.println("Variante d)");
        System.out.println(reverseStringInPlace(letters));
    }


    public static void printReverse(char[] letters) {
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

    public static String reverseStringWithNewArray(char[] letters) {
        char[] tmp = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            tmp[letters.length - i - 1] = letters[i];
        }
        String reverseString = new String(tmp);
        return reverseString;
    }

    public static String reverseStringInPlace(char[] letters) {
        char tmp;
        for (int i = 0; i < letters.length / 2; i++) {
            tmp = letters[letters.length - i - 1];
            letters[letters.length - i - 1] = letters[i];
            letters[i] = tmp;
        }

        return new String(letters);
    }

    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
