package Sandro.Programme;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Collections;

public class Strings {
    /**
     * <h1>Strings und Arrays</h1>
     * <i>Verwende für folgende Aufgabe die Lukas.week4.day3.Strings.ALL_MEMBERS Variable.</i>
     * Zerlege den String in ein Array.
     * <br>Mach für jede Aufgabe eine eigene Methode<br>
     * <ol>
     *     <li>Sortiere das Array alphabetisch aufsteigend und gib es aus<br><small>verwende compareTo</small></li>
     *     <li>Sortiere das Array alphabetisch absteigend und gib es aus<br><small>verwende compareTo</small></li>
     *     <li>Gib das Element mit den meisten Zeichen aus<br><small>verwende length()</small></li>
     *     <li>Gib das Element mit den wenigsten Zeichen aus<br><small>verwende length()</small></li>
     *     <li>Finde das wort mit den meisten Selbstlauten (a, e, i, o, u), jeder Selbstlaut zählt nur einmal!<br><small>verwende contains</small></li>
     *     <li><strong>BONUS AUFGABE</strong> Finde das wort mit den meisten Selbstlauten (a, e, i, o, u)<br><small>verwende toCharArray()</small></li>
     * </ol>
     */
    public static void main(String[] args) {

        String[] allMembers = Lukas.week4.day3.Strings.ALL_MEMBERS.split(" ");
        String allMembers1 = Lukas.week4.day3.Strings.ALL_MEMBERS;

/*      // Nach Buchstaben sortiert
        char[] stringToChar = allMembers1.toCharArray();
        Arrays.sort(stringToChar);
        System.out.println("Sortiert nach Buchstaben: " + "\n" + Arrays.toString(stringToChar) + "\n");*/

        // Nach Anfangsbuchstaben sortiert
        String[] members1 = allMembers1.split(" ");
        Arrays.sort(members1);
        System.out.println("\n" + "Sortiert nach Anfangsbuchstaben: " + "\n" + Arrays.toString(members1) + "\n");

        // Nach Anfangsbuchstaben sortiert absteigend
        Arrays.sort(members1, Collections.reverseOrder());
        System.out.println("Sortiert nach Anfangsbuchstaben absteigend: " + "\n" + Arrays.toString(members1) + "\n");

        // Nach Zahlen sortiert
        int[] numbers = {-8, 2, 25, 23, 17, 29, 52};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    Lukas.week4.day3.Arrays.swap(j, j + 1, numbers);
                }
            }
        }
        {
            System.out.println("Sortiert nach Zahlen: " + "\n" + Arrays.toString(numbers) + "\n");
        }

        for (int i = 0; i < allMembers.length; i++) {
            for (int j = 0; j < allMembers.length - 1; j++) {
                if (allMembers[j].compareTo(allMembers[j + 1]) > 0) {
                    String tmp = allMembers[1];
                    allMembers[1] = allMembers[0];
                    allMembers[0] = tmp;
                }
            }
        }
        {
            System.out.println("Sortiert nach Anfangsbuchstaben (Methode Swap): " + "\n" + Arrays.toString(allMembers) + "\n");
        }
    }
}



