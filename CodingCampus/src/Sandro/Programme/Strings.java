package Sandro.Programme;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Strings {
    /**
     * <h1>Strings und Arrays</h1>
     * <i>Verwende für folgende Aufgabe die Lukas.week4.day3.Strings.ALL_MEMBERS Variable.</i>
     * Zerlege den String in ein Array.
     * <br>Mach für jede Aufgabe eine eigene Methode<br>
     * <ol>
     * <li>Sortiere das Array alphabetisch aufsteigend und gib es aus<br><small>verwende compareTo</small></li>
     * <li>Sortiere das Array alphabetisch absteigend und gib es aus<br><small>verwende compareTo</small></li>
     * <li>Gib das Element mit den meisten Zeichen aus<br><small>verwende length()</small></li>
     * <li>Gib das Element mit den wenigsten Zeichen aus<br><small>verwende length()</small></li>
     * <li>Finde das wort mit den meisten Selbstlauten (a, e, i, o, u), jeder Selbstlaut zählt nur einmal!<br><small>verwende contains</small></li>
     * <li><strong>BONUS AUFGABE</strong> Finde das wort mit den meisten Selbstlauten (a, e, i, o, u)<br><small>verwende toCharArray()</small></li>
     * </ol>
     */
    public static void main(String[] args) {

        String[] allMembersArray = Lukas.week4.day3.Strings.ALL_MEMBERS.split(" ");

        printedSortedArrayAscending(allMembersArray);
        printedSortedArraysDescending(allMembersArray);
        printWordWithMostLetters(allMembersArray);
        printWordWithLeastLetters(allMembersArray);
        printNameWithTheMostVowels(allMembersArray);
        System.out.println("\n" + "\u001B[31m" + "Andere Methoden (schnellere Methoden):" + "\u001B[0m" + "\n");
        printAscendingOtherMethod(allMembersArray);
        printDescendingOtherMethod(allMembersArray);
        printSortedNumbers();
        printSortedLetters(allMembersArray);
    }

    public static void printedSortedArrayAscending(String[] allMembersArray) {
        for (int i = 0; i < allMembersArray.length; i++) {
            for (int j = 0; j < allMembersArray.length - 1; j++) {
                if (allMembersArray[j].compareTo(allMembersArray[j + 1]) > 0) {
                    String tmp = allMembersArray[j];
                    allMembersArray[j] = allMembersArray[j + 1];
                    allMembersArray[j + 1] = tmp;
                }
            }
        }
        System.out.println("\n" + "Ascending sorted: " + "\n" + Arrays.toString(allMembersArray) + "\n");
    }

    public static void printedSortedArraysDescending(String[] allMembersArray) {
        for (int i = 0; i < allMembersArray.length; i++) {
            for (int j = 0; j < allMembersArray.length - 1; j++) {
                if (allMembersArray[j].compareTo(allMembersArray[j + 1]) < 0) {
                    String tmp = allMembersArray[j];
                    allMembersArray[j] = allMembersArray[j + 1];
                    allMembersArray[j + 1] = tmp;
                }
            }
        }
        System.out.println("Descending sorted: " + "\n" + Arrays.toString(allMembersArray) + "\n");
    }

    public static void printWordWithMostLetters(String[] allMembersArray) {
        String mostLetter = allMembersArray[0];

        for (int i = 0; i < allMembersArray.length; i++) {
            if (mostLetter.length() < allMembersArray[i].length()) {
                mostLetter = allMembersArray[i];
            }
        }
        System.out.println("The word with the most letters is: " + "\n" + (mostLetter) + "\n");
    }

    public static void printWordWithLeastLetters(String[] allMembersArray) {
        String mostLetter = allMembersArray[0];

        for (int i = 0; i < allMembersArray.length; i++) {
            if (mostLetter.length() > allMembersArray[i].length()) {
                mostLetter = allMembersArray[i];
            }
        }
        System.out.println("The word with the least letters is: " + "\n" + (mostLetter) + "\n");
    }

    public static void printNameWithTheMostVowels(String[] allMembersArray) {

        int actualMostVowels = 0;
        String wordWithMostVowels = "";

        for (int i = 0; i < allMembersArray.length; i++) {
            int counter = 0;
            char[] letters = allMembersArray[i].toLowerCase(Locale.ROOT).toCharArray();

            for (int j = 0; j < letters.length; j++) {

                if (letters[j] == 'a') {
                    counter++;
                }
                if (letters[j] == 'e') {
                    counter++;
                }
                if (letters[j] == 'i') {
                    counter++;
                }
                if (letters[j] == 'o') {
                    counter++;
                }
                if (letters[j] == 'u') {
                    counter++;
                }
            }
            if (counter > actualMostVowels) {
                actualMostVowels = counter;
                wordWithMostVowels = allMembersArray[i];
            }
        }
        System.out.println("The name with the most vowels is: " + wordWithMostVowels);
    }

    // Nach Anfangsbuchstaben sortiert aufsteigend andere Methode
    public static void printAscendingOtherMethod(String[] allMembersArray) {
        Arrays.sort(allMembersArray);
        System.out.println("Sorted ascending by letters: " + "\n" + Arrays.toString(allMembersArray) + "\n");
    }

    // Nach Anfangsbuchstaben sortiert absteigend andere Methode
    public static void printDescendingOtherMethod(String[] allMembersArray) {
        Arrays.sort(allMembersArray, Collections.reverseOrder());
        System.out.println("Sorted descending by letters: " + "\n" + Arrays.toString(allMembersArray) + "\n");
    }

    // Nach Zahlen sortiert
    public static void printSortedNumbers() {
        int[] numbers = {-8, 2, 25, 23, 17, 29, 52};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    Lukas.week4.day3.Arrays.swap(j, j + 1, numbers);
                }
            }
        }
        System.out.println("Sorted by numbers: " + "\n" + Arrays.toString(numbers) + "\n");
    }

    // Nach Buchstaben sortiert
    public static void printSortedLetters(String[] allMembersArray) {
        String s = Arrays.toString(allMembersArray);
        char[] sortedLetters = s.toCharArray();
        Arrays.sort(sortedLetters);
        System.out.println("Sortiert by letters: " + "\n" + Arrays.toString(sortedLetters) + "\n");
    }
}




