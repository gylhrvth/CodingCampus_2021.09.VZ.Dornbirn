package Lukas.week3.day4;

import java.util.Scanner;

public class Arrays {
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


        System.out.println("---");
        System.out.println(Runtime.getRuntime().freeMemory() / 1024f / 1024f);
        System.out.println(Runtime.getRuntime().maxMemory() / 1024f / 1024f);
        System.out.println(Runtime.getRuntime().totalMemory() / 1024f / 1024f);

    }

    //T o n i    < length: 4
    //0 1 2 3
    public static void printReverse(char[] letters) {
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
        }
        System.out.println();
    }

    public static String reverseString(char[] letters) {
        String tmp = "";
        for (int i = 0; i < letters.length; i++) {
            tmp += letters[i];
        }
        return tmp;
    }

    public static String reverseStringWithNewArray(char[] letters) {
        char[] tmp = new char[letters.length];
        for (int i = 0; i < letters.length; i++) {
            tmp[i] = letters[i];
        }
        String reverseString = new String(tmp);
        return reverseString;
    }

    public static String reverseStringInPlace(char[] letters) {
        char tmp;
        for (int i = 0; i < letters.length; i++) {

        }
        return new String(letters);
    }

    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
