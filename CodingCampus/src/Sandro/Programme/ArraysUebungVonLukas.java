package Sandro.Programme;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ArraysUebungVonLukas {

    public static void main(String[] args) {

        //  TODO:  Eine Zeile aus der Kommandozeile einlesen
        //         Zeile ausgeben
        //         Zeile in Character Array verwandeln

        System.out.println();
        System.out.println("Tragen Sie die Namen des Studenten ein um Details zu erhalten und umzuformatieren: ");

        Scanner scanner = new Scanner(System.in);
        String nameStudents = scanner.nextLine();
        System.out.println(nameStudents);

        char[] myCharArray = nameStudents.toCharArray();

        //TODO: Variante a) Direkt umgedreht ausgeben

        for (int i = myCharArray.length - 1; i >= 0; i--)
            System.out.print(myCharArray[i]);
        System.out.println();

        //TODO: Variante b) Umdrehen mithilfe eines Strings -> String ausgeben

        System.out.println(Arrays.toString(myCharArray));

        //TODO: Variante c) Umdrehen mithilfe eines neuen Character Arrays -> Character Array in String umwandeln und ausgeben

        char[] newCharArray2 = new char[]{'H', 'a', 'l', 'l', 'o'};
        String myString2 = new String(newCharArray2);

        System.out.println(myString2);

        //TODO: Variante d) Umdrehen im bestehenden Array des Inputs -> Character Array in String umwandeln und ausgeben

        System.out.println();

        //TODO: Text aus Kommandozeile einlesen

        System.out.println("Geben Sie ein Wort ein um Details zu erhalten und umzuformatieren ");
        String word = scanner.nextLine();


        //TODO: Buchstaben case insensitive Zählen (A zählt für a)

        char[] myCharArray2 = word.toCharArray();

        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());

        //TODO: und ausgeben wie oft jeder Buchstabe vorkommt

        String myString3 = new String(myCharArray2);

        String w = myString3;
        int anzahl = 0;
        for (int i = 0; i < myString3.length(); i++) {
            if (myString3.charAt(i) == 'a') anzahl++;
        }
        System.out.println("Anzahl der Vorkommen von a: " + anzahl);

    }
}

